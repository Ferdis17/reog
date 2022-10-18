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

    public static Map<String, Long> countChars(String str) {

        Map<String, Long> charsMap = Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return charsMap;
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James"));
        String str = "Muriyesu";

        Map<String, Long> wordMap = countWords(names);
        Map<String, Long> charsMap = countChars(str);

        wordMap.forEach((key, value) -> System.out.println("["+ key + ":" + value +"]"));
        charsMap.forEach((i,j) -> System.out.println("["+ i + ":" + j+ "]"));
    }
}
