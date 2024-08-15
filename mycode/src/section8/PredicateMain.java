package section8;

import java.util.function.Predicate;

public class PredicateMain {

    static Predicate<Integer> evenNo = (a) -> a%2==0;
    static Predicate<Integer> divisibleBy5 = (a) -> a%5==0;

    public static void EvenAndDivisibleBy5(){
        System.out.println("Number is even and divisble by 5: "+evenNo.and(divisibleBy5).test(6));
    }

    public static void Negate(){
        System.out.println("With negation: "+evenNo.and(divisibleBy5).negate().test(6));
    }

    public static void main(String[] args) {

//        System.out.println(evenNo.test(2));
//        EvenAndDivisibleBy5();
        Negate();
    }
}
