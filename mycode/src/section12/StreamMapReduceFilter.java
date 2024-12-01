package section12;

import data.Student;
import data.StudentDataBase;

import java.util.List;

public class StreamMapReduceFilter {

    // we need to get the sum of student whose grade is more than 2 and male
    public static int totalNotebook(List<Student> studentList){
        return studentList.stream()
                .filter(student -> student.getGradeLevel()>=3)
                .filter(student -> student.getGender().equals("male"))
                .map(Student::getNoteBooks)
//                .reduce(0,(a,b)-> a+b);
                .reduce(0, Integer::sum);
    }

    public static void main(String[] args) {
        System.out.println("Total number of notebooks: "+totalNotebook(StudentDataBase.getAllStudents()));
    }
}
