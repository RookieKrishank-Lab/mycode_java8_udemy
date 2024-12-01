package section12;

import data.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMax {

    // MAX
    public static int findMaxValue(List<Integer> numberList){
        return numberList.stream()
                .reduce(0,(num1,num2)->num1>num2 ? num1 : num2);
    }

    public static Optional<Integer> findMaxValueOptional(List<Integer> numberList){
        return numberList.stream()
                .peek(num -> System.out.println("Current number: " + num))
                .reduce((num1,num2)->num1>num2 ? num1 : num2);
    }

    // MIN
    public static int findMinValue(List<Integer> numberList){
        return numberList.stream()
                .reduce(0,(num1,num2)->num1<num2 ? num1 : num2);
    }

    public static Optional<Integer> findMinValueOptional(List<Integer> numberList){
        return numberList.stream()
                .reduce((num1,num2)->num1<num2 ? num1 : num2);
    }

    public static void main(String[] args){

         List<Integer> list = Arrays.asList(1,2,3);
        //List<Integer> list = new ArrayList<>();

        // Normal method call
         System.out.println("Max value of the list without optional is: "+ findMaxValue(list));
//        System.out.println("Min value of the list without optional is: "+ findMinValue(list));

        // Optional method call
        Optional<Integer> listOptionalMax = findMaxValueOptional(list);
        /*if(listOptionalMax.isPresent()) {
            System.out.println("Max value of the list with optional is: " +listOptionalMax.get());
        }else{
            System.out.println("The list is empty");
        }

        // listOptionalMax.ifPresent(value -> System.out.println("Max value of the list with optional is: " +listOptionalMax.get()));

        Optional<Integer> listOptionalMin = findMinValueOptional(list);
        if(listOptionalMin.isPresent()) {
            System.out.println("Min value of the list with optional is: " +listOptionalMin.get());
        }else{
            System.out.println("The list is empty");
        }*/
        }
}
