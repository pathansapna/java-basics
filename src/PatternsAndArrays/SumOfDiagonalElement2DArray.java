package PatternsAndArrays;
/**
 * Write a program that calculates the sum of the diagonal elements in a two-dimensional array. The function should return an integer representing the sum of the diagonal elements.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Output: 15*/
public class SumOfDiagonalElement2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        findDiagonalSum(arr);
    }

    private static int findDiagonalSum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i][i];
        }
        System.out.println(sum);
        return sum;
    }
}
