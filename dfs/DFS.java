package dfs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class DFS {
    public static void main(String[] args) {

        List<Integer> myList = Arrays.asList(1,2,3,4);

        myList.forEach(n -> System.out.println(n + " ==> " + Thread.currentThread().getName()));
        myList.parallelStream().forEach(n -> System.out.println(n + " " + Thread.currentThread().getName()));
        int sum = myList.stream().reduce(0, Integer::sum);
        System.out.println(sum );

        int sum1 = myList.parallelStream().reduce(5, Integer::sum);
        System.out.println(sum1);

        int sum2 = IntStream.rangeClosed(0, 1000).filter(n -> n % 2 == 0).parallel().reduce(0, Integer::sum);
        System.out.println(sum2);

    }
}
