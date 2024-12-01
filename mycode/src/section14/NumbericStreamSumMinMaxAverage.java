package section14;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumbericStreamSumMinMaxAverage {

    public static void main(String[] args) {
        OptionalInt min = IntStream.rangeClosed(1,4).min();
        System.out.println("Min value between 1 and 4 is: "+min.getAsInt());

        int sum = IntStream.rangeClosed(1, 4).sum();
        System.out.println("Sum of number from 1 to 4 is: "+sum);

        OptionalDouble average = IntStream.rangeClosed(1, 4).average();
        System.out.println("Average of 1,2,3,4 is: "+average.getAsDouble());
    }
}
