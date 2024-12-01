package section12;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkip {

    // limit
    public static Optional<Integer> limitList(List<Integer> list){
        return list.stream()
                .peek(System.out::println)
                .limit(2)
                .reduce(Integer::sum);
    }

    // skip
    public static Optional<Integer> skipList(List<Integer> list){
        return list.stream()
                .peek(System.out::println)
                .skip(2)
                .reduce(Integer::sum);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Optional<Integer> limitedList = limitList(list);
        Optional<Integer> skippedList = skipList(list);

        limitedList.ifPresent(num -> System.out.println("total sum of list number is: "+limitedList.get()));
        skippedList.ifPresent(num -> System.out.println("total sum of list number is: "+skippedList.get()));

    }

}
