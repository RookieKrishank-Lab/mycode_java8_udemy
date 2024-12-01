package section14;

import java.util.List;
import java.util.stream.IntStream;

public class UsingNumericStreamSum {

    public static int SumOfNNumber(List<Integer> list){
        return list.stream()
                .reduce(0,(a,b)->a+b);              // here we are converting Integer(wrapper) to int(primitive)
    }

    public static int SumOfNNumberUsingNumericStream(){
        return IntStream.rangeClosed(1,3)
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3);
        System.out.println("sum of integer using wrapper class: "+SumOfNNumber(list));
        System.out.println("sum of integer using number stream: "+SumOfNNumberUsingNumericStream());
    }
}
