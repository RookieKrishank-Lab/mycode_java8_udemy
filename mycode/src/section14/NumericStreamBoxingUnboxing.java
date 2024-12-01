package section14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

    //Boxing means primitive to wrapper
    public static List<Integer> boxing(){
        return IntStream.rangeClosed(1,5)
                //input is int
                .boxed()
                //output is Integer
                .collect(Collectors.toList());
    }

    //Unboxing means wrapper to primitive
    public static int Unboxing(List<Integer> integerList){
        return integerList.stream()
                //map return a new IntStream and intValue convert the element from Integer to int
                .mapToInt(Integer::intValue).sum();
    }

    public static void main(String[] args) {
        System.out.println("Boxing: "+boxing());
        //we will get the list of Integer
        List<Integer> intergerList = boxing();
        //pass that list of Integer to unboxing
        System.out.println("Unboxing: "+Unboxing(intergerList));
    }
}
