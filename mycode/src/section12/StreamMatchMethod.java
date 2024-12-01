package section12;

import data.StudentDataBase;

public class StreamMatchMethod {

    public static boolean anyMatch(){
        return StudentDataBase.getAllStudents().stream()
                .anyMatch(student -> student.getGradeLevel()>3.5);
    }

    public static boolean allMatch(){
        return StudentDataBase.getAllStudents().stream()
                .allMatch(student -> student.getGradeLevel()>3.5);
    }

    public static boolean noneMatch(){
        return StudentDataBase.getAllStudents().stream()
                .noneMatch(student -> student.getGradeLevel()>3.5);
    }

    public static void main(String[] args) {

        System.out.println("Any Match: "+anyMatch());
        System.out.println("All Match: "+allMatch());
        System.out.println("None Match: "+noneMatch());
    }
}
