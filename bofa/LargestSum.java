package bofa;//
//
//A = [3, 4, 7, 2 ,2, 5, 0, 7, 9, 11]
//        Find the total number of adjacent pairs whose sum exist in the array as an element.
//        Output: 7
//        (3,4) = 7
//        (4,7) = 11
//        (7,2) = 9
//        (2,5) = 7
//        (0,7) = 7
//        (2,2) = 4
//        (5,0) = 5


public class LargestSum {

    public int adjacentElementsSum(int[] arr) {
        int largestSum = 0;
        int previousSum = 0;

        for (int i = 0; i <= arr.length; i++) {

            if (i == 0) {
                for (int j = 0; j < arr.length; j++) {
                    largestSum = largestSum + arr[j];
                }
                previousSum = largestSum;
            } else {
                int currentSum = previousSum - arr[i - 1] + arr[i + arr.length - 1];
                {
                    if (currentSum > largestSum) {
                        largestSum = currentSum;
                    }
                    previousSum = currentSum;
                }
            }
        }
        return largestSum;
    }


    public static void main(String[] args) {
        int [] A = {3, 4, 7, 2 ,2, 5, 0, 7, 9, 11};
        LargestSum obj = new LargestSum();
        System.out.println(obj.adjacentElementsSum(A));
    }
}