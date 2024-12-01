package section16.parrallel.stream;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamStudentActivity {

    public static List<String> sequentialStreamPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> sequentialStudentActivity =  StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
//                .distinct()
//                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in sequential: "+(endTime-startTime));
        return sequentialStudentActivity;
    }

    public static List<String> parallelStreamPrintStudentActivities(){
        long startTime = System.currentTimeMillis();
        List<String> parallelStudentActivity = StudentDataBase.getAllStudents()
//                .stream()
//                .parallel()
                .parallelStream()
                .map(Student::getActivities)
                .flatMap(List::stream)
//                .distinct()
//                .sorted()
                .collect(Collectors.toList());
        long endTime = System.currentTimeMillis();
        System.out.println("Duration to execute the pipeline in parallel: "+(endTime-startTime));
        return parallelStudentActivity;
    }

    public static void main(String[] args) {
        sequentialStreamPrintStudentActivities();
        parallelStreamPrintStudentActivities();
    }

}
