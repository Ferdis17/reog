package someCode;

import java.util.*;
import java.util.stream.IntStream;

public class PrintSum {

    // print the sum of all even numbers below 1000
    public static int printSum (int num) {

        int sum = 0;
//        for (int i = 0; i <= num; i++) {
//            if(i%2 == 0){
//                sum +=i;
//            }
//        }

       sum = IntStream.rangeClosed(0,1000).filter(n -> n % 2 == 0).sum();

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(printSum(1000));

        //given two arrays and merge them numbers without duplications and in ascending order? Given arrays are: {1,7,3,4,8}, {9,2,3,1,6}
        int[] arr1 = new int[] {1,7,3,4,8};
        int[] arr2 = new int[] {9,2,3,1,6};

        int [] mergedArray = IntStream.concat(IntStream.of(arr1),IntStream.of(arr2))
                .distinct()
                .sorted()
                .toArray();

        System.out.println(Arrays.toString(mergedArray));
    }


}
