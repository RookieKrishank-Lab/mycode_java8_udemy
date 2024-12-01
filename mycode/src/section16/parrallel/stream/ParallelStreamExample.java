package section16.parrallel.stream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

//sum of n given number using sequential and parallel stream
public class ParallelStreamExample {

    public static long calculatePerformanceResult(Supplier<Integer> streamType, int numberOfTimes){
        long startTime = System.currentTimeMillis();
        for (int i=0; i<numberOfTimes;i++){
            streamType.get();
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    public static int sumSequentialStream(){
        return IntStream.rangeClosed(1,1000000)
                .sum();
    }

    public static int sumParallelStream(){
        return IntStream.rangeClosed(1,1000000)
                //split the data into multiple part and process them concurrently. Accumulate the result and give the result in output
                .parallel()
                .sum();
    }

    public static void main(String[] args) {
        System.out.println("Sequential stream time: "+calculatePerformanceResult(ParallelStreamExample::sumSequentialStream, 20));
        System.out.println("Parallel stream time: "+calculatePerformanceResult(ParallelStreamExample::sumParallelStream, 20));
    }
}
