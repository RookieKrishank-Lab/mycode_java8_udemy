package section8;

import java.util.function.UnaryOperator;

// input and output type is same
public class UnaryOperatorExample {

    static UnaryOperator<String> unaryOperator = s -> s.concat("END");

    public static void main(String[] args) {
        System.out.println(unaryOperator.apply("hi "));
    }
}
