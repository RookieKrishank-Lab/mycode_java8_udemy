package section7;

import java.util.Comparator;

public class ComparatorMain {

    public static void main(String[] args) {


        //without lambda
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);                //0: o1==o2, 1:o1>o2, -1: o1<o2
            }
        };
        System.out.println("the result of the comparator is: " + comparator.compare(1,2));

        // with lambda
        Comparator<Integer> comparatorLambda = (o1, o2) -> o1.compareTo(o2);
        System.out.println("Lambda comparator: " + comparatorLambda.compare(3,1));

    }
}
