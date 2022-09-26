package sept_2022.someAlgorithms;

public class QuickSort {
    public static void quickSort(int [] arr, int begin, int end) {
        if(begin < end){
            int partitionIndex = partitionArr(arr, begin, end);
            quickSort(arr, begin,partitionIndex-1);
            quickSort(arr,partitionIndex+1, end);
        }

    }

    private static int partitionArr(int[] arr, int begin, int end) {

        int pivot = arr[end];
        int i = begin-1;

        for(int j = begin; j<end; j++) {
            if(arr[j] <= pivot) {
                i++;

                int tempSwap = arr[i];
                arr[i] = arr[j];
                arr[j] = tempSwap;
            }
        }
        int tempSwap = arr[i+1];
        arr[i+1] = arr[end];
        arr[end] = tempSwap;

        int partitionIndex;
        partitionIndex = i+1;

        return partitionIndex;
    }

    public static void main(String[] args) {
        int[] a = new int[] {1,4,2,3,6};
        quickSort(a, 0, 4);

        for(Integer i : a)
            System.out.println(i);
    }
}
