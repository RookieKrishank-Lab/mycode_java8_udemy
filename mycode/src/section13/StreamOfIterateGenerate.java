package section13;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOfIterateGenerate {

    public static void main(String[] args) {

        Stream<String> stringStream = Stream.of("a","b","c");
        stringStream.forEach(System.out::println);

        System.out.println("----------");

        Stream<Integer> integerStream = Stream.iterate(0, n -> n + 2);
        integerStream.limit(10).forEach(System.out::println);

        System.out.println("----------");

        Supplier<Integer> randomNumber = new Random()::nextInt;
        Stream.generate(randomNumber).limit(10).forEach(System.out::println);

    }
}
