package sept_2022.someAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountStreams {

    public static Map<String, Long> countWords(List<String> list) {
        return list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Map<String, Long> countChars(String str) {

        return Arrays.stream(str.split(""))
                .map(String::toLowerCase)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static void occurrence(List<String> list, String [] arr) {
        Map<String, Long> wordsMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        for (String s : arr) {
            System.out.println(s + " : " + wordsMap.get(s));
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Sam", "James", "Selena", "James", "Joe", "Sam", "James"));
        String str = "Muriyesu";

        Map<String, Long> wordMap = countWords(names);
        Map<String, Long> charsMap = countChars(str);
        occurrence(names, new String [] {"Sam", "James"});

        wordMap.forEach((key, value) -> System.out.println("["+ key + ":" + value +"]"));
        charsMap.forEach((i,j) -> System.out.println("["+ i + ":" + j+ "]"));
    }
}
