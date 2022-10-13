package sept_2022.someAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountStreams {

    public static Map<String, Long> countWords(List<String> list) {
        Map<String, Long> wordCount = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        return wordCount;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James"));

        Map<String, Long> wordMap = countWords(names);

        wordMap.forEach((key, value) -> System.out.println(key + ":" + value));
    }
}
