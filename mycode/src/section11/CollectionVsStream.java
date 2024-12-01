package section11;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionVsStream {

    public static void main(String[] args) {

        // 1
        // Created the collection here
        List<String> nameArray = new ArrayList<>();

        // modified the collection here
        nameArray.add("joy");
        nameArray.add("chad");
        nameArray.add("sam");

        // Created a stream
        nameArray.stream();                 // here we cant add,modify, delete elements from the stream.

        //4
        for (String names : nameArray){
            System.out.println(names);
        }
        for (String names : nameArray){
            System.out.println(names);
        }
        System.out.println("------stream OP------");
        Stream<String> nameStream = nameArray.stream();
        nameStream.forEach(name -> System.out.println(name));
        //nameStream.forEach(System.out::println);              // we will get exception if we do so
    }
}
