package array;

import java.util.Arrays;

public class CyclicArray {
    static int[] arr = {1,2,3,4};

    public static void main(String[] args) {
        int n = arr.length;
        int j = n - 1;
        int i = 0;
        while (i != j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;

        }
        System.out.println("Cyclically Array is ");
        System.out.println(Arrays.toString(arr));

    }
}
