package PatternsAndArrays;
/**
 * Write a program that finds the minimum element in a given 2D array of elements. The function should return the minimum element.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Output: 1*/
public class MinElementFrom2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};
        minimum(arr);
    }

    private static int minimum(int[][] arr) {
        int minElement = arr[0][0];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (arr[i][j] < minElement) {
                    minElement = arr[i][j];
                }
            }
        }
        return minElement;
    }
}
