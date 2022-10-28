package wipro;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class  PrintTopThree{

    public static Map<Integer, Long> countOccurrenceAndPrintTopThree (int [] arr) {

        return Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy( x -> x, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .limit(3)
                .collect(Collectors.toMap( Map.Entry::getKey,
                        Map.Entry::getValue,
                        (i, j) -> i, LinkedHashMap::new));
    }

    public static void main(String[] args) {
        int [] arr = {1,3,2,2,3,4,3,2,5,4,3,2,4,5,3,2,3,4,3,2,4,3};

        Map<Integer, Long> map = countOccurrenceAndPrintTopThree(arr);
        map.forEach((k,v) -> System.out.println(k + ":" + v));
    }
}
