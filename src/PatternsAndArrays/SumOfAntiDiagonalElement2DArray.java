package PatternsAndArrays;
/**
 * Write a program that calculates the sum of the anti-diagonal elements in a two-dimensional array. The function should return an integer representing the sum of the anti-diagonal elements.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 6],[7, 8, 9]]
 * Output: 15*/
public class SumOfAntiDiagonalElement2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        sumAntiDiagonal(arr);
    }

    private static int sumAntiDiagonal(int[][] arr) {
        int sum = 0;
        for (int i = arr.length-1; i >= 0; i--){
            sum += arr[i][i];
        }
        System.out.println(sum);
        return sum;
    }
}
