package section14;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

//Converting IntStream to various datatype
public class NumbericStreamMapTo {

    public static List<Integer> mapToObject(){
        return IntStream.rangeClosed(1,5)
                .mapToObj((i)->new Integer(i))
                .collect(Collectors.toList());
    }

    public static List<Long> mapToLong(){
        return IntStream.rangeClosed(1,5)
                .mapToLong((i)->i)
                .boxed()
                .collect(Collectors.toList());
    }

    public static double mapToDouble(){
        return IntStream.rangeClosed(1,5)
                .mapToDouble((i)->i)
//                .boxed()
//                .collect(Collectors.toList());
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("MapToObject: "+mapToObject());
        System.out.println("MapToLong: "+mapToLong());
        System.out.println("MapToDouble: "+mapToDouble());
    }
}
