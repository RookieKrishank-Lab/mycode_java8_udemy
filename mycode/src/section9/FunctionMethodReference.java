package section9;

import java.util.function.Function;

//instance method reference as toUpperCase is not a static method
public class FunctionMethodReference {

    // static Function<String,String> upperCase = str -> str.toUpperCase();
    static Function<String,String> upperCase = String::toUpperCase;

    public static void main(String[] args) {
        System.out.println(upperCase.apply("hi you"));

    }
}
