package section14;

import java.util.stream.IntStream;

//This is way of using range and rangeClose of Double data type
//As we cant use range and rangeClose for double directly. we need to use the following approach
public class NumericStreamRangeAndRangeClosed {

    public static void main(String[] args) {

        IntStream.rangeClosed(1,4).asDoubleStream().forEach(System.out::println);
    }
}
