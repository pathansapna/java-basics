package array;

import java.util.Arrays;

public class MinMaxDiffHeights {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        int n = arr.length;
        int k = 8;
        minMaxHeights(arr, n, k);
        System.out.println(minMaxHeights(arr, n, k));
    }

    private static int minMaxHeights(int[] arr, int n, int k) {
        Arrays.sort(arr);

        return n;
    }

}
