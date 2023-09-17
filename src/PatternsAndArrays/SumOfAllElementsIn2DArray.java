package PatternsAndArrays;
/**
 * You are given an 2D array of integers. Your task is to find the sum of all elements in the array.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 6]]
 * Output: 21*/
public class SumOfAllElementsIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        sumOfElements(arr);
    }

    private static void sumOfElements(int[][] arr) {
        int sumElement = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sumElement += arr[i][j];
            }
        }                System.out.println(sumElement);


    }
}
