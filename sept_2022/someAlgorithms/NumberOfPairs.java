package sept_2022.someAlgorithms;

import java.util.HashMap;
import java.util.Map;

public class NumberOfPairs {

    public static int numberOfPairs(int [] arr, int sum) {

        Map<Integer, Integer> intMap = new HashMap<>();

        for(int i = 0 ; i < arr.length; i++){
            if(!intMap.containsKey(sum - arr[i])) {
                intMap.put(arr[i], 1);
            } else {
                intMap.put(arr[i], intMap.get(arr[i]) + 1);
            }
        }

        int countPairs = 0;

        for(int i = 0; i < arr.length; i++) {

        }
        return 0;
    }
}
