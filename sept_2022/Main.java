package sept_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");

        System.out.println("Using BinarySearch function:");
        System.out.println("=============================");

        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(searchElement(list, 4));
    }

    public static int searchElement(List<Integer> a, int b) {

        return Collections.binarySearch(a,b);
    }
}
