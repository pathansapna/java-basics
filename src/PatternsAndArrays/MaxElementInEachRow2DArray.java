package PatternsAndArrays;
/**
 * Write a program that finds the maximum element in each row of a given two-dimensional array (matrix). The function should return a new array containing the maximum elements from each row of the matrix.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Output: [3, 6, 9]*/
public class MaxElementInEachRow2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        findRowMaxima(arr);
    }

    private static int[] findRowMaxima(int[][] arr) {
        int[] output = new int[arr.length];
        for (int i =0; i < arr.length; i++){
            int maxRowElement = arr[i][0];

            for (int j = 1; j < arr[i].length; j++){
                if (arr[i][j] > maxRowElement){
                    maxRowElement = arr[i][j];
                }
            }
            output[i] = maxRowElement;
        }
        return output;
    }
}
