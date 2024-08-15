package section8;

/*
* Here we are calling the function functional interface from different class
* */
public class FunctionExample1 {

    public static String performConcat(String str){
        return FunctionExample.concat.apply(str);
    }

    public static void main(String[] args) {
        System.out.println(performConcat("Different class"));
    }
}
