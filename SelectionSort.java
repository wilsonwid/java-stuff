import java.util.*;

class SelectionSort {
    public static void main(String[] args) {
        int[] a = {5, 3, 1, 2, 8, 9, 0, 0, 0, 0};
        selectionSort(a);
    }

    public static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int minIndex = findMinIndex(arr, i);
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int findMinIndex(int[] arr, int start) {
        int minimum = 1000000000, minIndex = 0;
        for(int i = start; i < arr.length; i++) {
            if(arr[i] < minimum) {
                minimum = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
}