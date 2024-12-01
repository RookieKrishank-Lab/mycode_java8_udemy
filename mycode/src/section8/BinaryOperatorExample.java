package section8;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static Comparator<Integer> binaryOperator = (a, b) -> a.compareTo(b);


    public static void main(String[] args) {

        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        System.out.println("Multiply operation on result is "+ multiply.apply(2,3));

        BinaryOperator<Integer> min = BinaryOperator.minBy(binaryOperator);
        System.out.println("The Min value: "+min.apply(5,4));

        BinaryOperator<Integer> max = BinaryOperator.maxBy(binaryOperator);
        System.out.println("The Max value: "+max.apply(6,19));
    }
}
