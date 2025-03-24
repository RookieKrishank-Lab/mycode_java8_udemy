package section18;

import data.Student;
import data.StudentDataBase;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

//Sorting using comparator interface
//sort by name and grade individually then combining then
public class SortUsingComparator {

    static Consumer<Student> studentConsumer = student ->  System.out.println(student);            //Student::getName
    static Comparator<Student> nameComparator = Comparator.comparing(Student::getName);
    static Comparator<Student> gradeComparator = Comparator.comparing(Student::getGradeLevel);

    public static void sortByName(List<Student> studentList){
        //Create a comparator and define the property on the basis of which we will sort the studentList. here the property is name
//        Comparator<Student> nameComparator =  Comparator.comparing(student -> student.getName());
        Comparator<Student> nameComparator =  Comparator.comparing(Student::getName);
        //now we are sorting the studentList base on the comparator variable
        studentList.sort(nameComparator);
        //we are printing each element of the sorted list
        studentList.forEach(studentConsumer);
    }

    public static void sortByGPA(List<Student> studentList){
        Comparator<Student> gpaComparator = Comparator.comparingDouble(Student::getGpa);            //as getGpa is returning double we need to use comparingDouble
        studentList.sort(gpaComparator);
        studentList.forEach(studentConsumer);
    }

    //sorting on the basis of 2 comparator variable
    public static void comparatorChaining(List<Student> studentList){
        studentList.sort(nameComparator.thenComparing(gradeComparator));
        studentList.forEach(studentConsumer);
    }

    //if there is a null element in the list we will get NPE while sorting, to get rid of that we will use nullFirst() or nullLast()
    public static void sortWithNullValues(List<Student> studentList){
        Comparator<Student> studentComparator = Comparator.nullsFirst(gradeComparator);
        studentList.sort(studentComparator);
        studentList.forEach(studentConsumer);
    }

    public static void main(String[] args) {
        List<Student> studentList = StudentDataBase.getAllStudents();
//        System.out.println(studentList);
        System.out.println("Before sorting");
        studentList.forEach(studentConsumer);
        System.out.println("After sorting");
//        sortByName(studentList);
//        sortByGPA(studentList);
//        comparatorChaining(studentList);
        sortWithNullValues(studentList);
    }
}
