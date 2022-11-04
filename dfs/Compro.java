package dfs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Compro {

    public static void main(String[] args) {

        System.out.println(computeWeightedSum(new int [] {1, 2, 3, 4, 5}));
        System.out.println(computeWeightedSum(new int [] {1, 3, 5}));
        System.out.println(computeWeightedSum(new int [] {2, 4, 6}));
        System.out.println(computeWeightedSum(new int [] {1}));
        System.out.println(computeWeightedSum(new int [] {2}));
        System.out.println(computeWeightedSum(new int [] {0, 0, 0, 0, 0}));

    }

    public static int computeWeightedSum(int[ ] a) {


        int evenSum = 0;
        int oddSum = 0;

        for(int i : a) {
            if (i % 2 == 0) {
                evenSum += 2*i;

            } else {
                oddSum += 3*i;
            }
        }

        return evenSum + oddSum;


    }
}
