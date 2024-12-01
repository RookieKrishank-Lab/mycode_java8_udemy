package section18;

import java.util.*;

//we need to sort the list of elements in an array
public class DefaultMethodBegin {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ajay","Roy","Vivek","Kaush","Anjum","San");

        //before java8 we need to use Collections
        Collections.sort(list);
        System.out.println("Sorting of list using Collections.sort(): "+list);

        //after java8 we could use the default method of List interface
        list.sort(Comparator.naturalOrder());
        System.out.println("Sorting of list using list.sort(): "+list);

        //reverseOrder ie descending
        list.sort(Comparator.reverseOrder());
        System.out.println("Sorting of list using list.sort() reverse: "+list);
    }
}
