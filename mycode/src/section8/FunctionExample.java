package section8;

import java.util.function.Function;

public class FunctionExample {

    //Function<String1,String2> - String1 is the argument and String2 is the output
    static Function<String,String> upperCase = s -> s.toUpperCase();
    static Function<String,String> concat = s -> s.toUpperCase().concat("end");

    public static void main(String[] args){

        //apply method
        System.out.println("Single function interface:" + upperCase.apply("hello string"));

        System.out.println("Single function interface:" + concat.apply("concat string"));

        //chaining 2 function
        System.out.println("Chaining function interface:" + upperCase.andThen(concat).apply("and then "));

        //compose method
        /*
        * execute the 2nd operation first (ie concat) but it will be printed in the sequence it is written
        * */
        System.out.println("Compose function: "+upperCase.compose(concat).apply("compose "));
    }
}
