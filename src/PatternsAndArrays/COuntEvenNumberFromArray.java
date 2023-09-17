package PatternsAndArrays;

public class COuntEvenNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        countEvens(arr);
    }

    public static void countEvens(int[] arr) {
         int count = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                count++;
            }

        }
        System.out.println(count);
    }
}
