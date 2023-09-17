package PatternsAndArrays;

public class MinNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 6, 3};
        findMin(arr);
    }

    private static void findMin(int[] arr) {
        int min = arr[0];
        for (int j : arr) {
            if (min >= j) {
                min = j;
            }
        }
        System.out.println(min);
    }
}
