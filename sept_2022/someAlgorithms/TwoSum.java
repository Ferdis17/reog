package sept_2022.someAlgorithms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 4, 5, 4, 7}, 7)));
    }

    public static int[] twoSum(int [] arr, int sum){
        Map<Integer,Integer> map = new HashMap<>();
        int [] result = new int[2];

        for(int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(map.containsValue(sum - map.get(i))) {
                result[0] = sum - map.get(i);
                result[1] = arr[i];
            }

        }
        return result;
    }

    public static int [] twoSumMap(int [] arr, int target) {
        Map<Integer,Integer> intMap = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int complement = target-arr[i];

            if(intMap.containsKey(complement)){
                return new int [] {intMap.get(complement), i};
            } else {
                intMap.put(arr[i], i);
            }
        }
    return new int[]{};
    }
}
