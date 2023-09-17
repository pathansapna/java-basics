package PatternsAndArrays;

public class MaximumNumberInArray {
    public static void main(String[] args) {
        int[] arr = {1,2,6,3};
        findMax(arr);
    }

    private static void findMax(int[] arr) {
        int max = 0;
        for (int j : arr) {
            if (max <= j) {
                max = j;
            }
        }
        System.out.println(max);

    }
}
