package section12;

import data.Student;
import data.StudentDataBase;

import java.util.List;
import java.util.stream.Collectors;

public class DistinctCountSort {

    // method to return unique element and that to in a sorted manner
    // distinct() is use to return stream with unique element
    // sort() to sort the elements in stream
    public static List<String> studentActivities(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // return count of activities
    // count() return a long with total numb of element in stream
    public static long activitiesCount(){
        return StudentDataBase.getAllStudents().stream()
                .map(Student::getActivities)
                .flatMap(List::stream)
                .distinct()
                .count();
    }

    public static void main(String[] args){
        System.out.println("Student unique activities and in a sorted manner: "+studentActivities());
        System.out.println("Number of element in a stream: "+activitiesCount());
    }
}
