package sept_2022.someAlgorithms;

public class MergeSort {

    public static void main(String[] args) {
        int [] arr = {12,1,10,50,5,15,45};
        System.out.println("===========unsorted==============");
        for (int j : arr) {

            System.out.println(j + " ");
        }
        mergeSort(arr, arr.length);
        System.out.println("===========sorted==============");
        for (int j : arr) {
            System.out.println(j + " ");
        }
    }

    private static void mergeArray(int [] arr, int [] left_arr, int [] right_arr) {

        int i=0, l=0, r = 0;

        while(l<left_arr.length && r<right_arr.length) {
            if(left_arr[l] < right_arr[r]) {
                arr[i++] = left_arr[l++];
            }
            else {
                arr[i++] = right_arr[r++];
            }
        }
        while(l < left_arr.length) {
            arr[i++] = left_arr[l++];
        }
        while (r < right_arr.length) {
            arr[i++] = right_arr[r++];
        }
    }

    public static void mergeSort(int [] arr, int len) {
        if(len < 2) {
            return;
        }
        int mid  =  len/2;
        int [] left_arr = new int[mid];
        int [] right_arr = new int[len-mid];

        // fill elements in two sub_arrays

        int k = 0;
        for(int i = 0; i<len; i++) {
            if(i < mid) {
                left_arr[i] = arr[i];
            } else {
                right_arr[k] = arr[i];
                k +=1;

            }
        }
        mergeSort(left_arr, mid);
        mergeSort(right_arr,len-mid);

        mergeArray(arr, left_arr, right_arr);
    }
}
