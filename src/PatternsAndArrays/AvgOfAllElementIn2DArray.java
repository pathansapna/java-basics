package PatternsAndArrays;
/**
 * Write a program that calculates the average of all elements in a given 2D array. The function should return a float representing the average of all elements in the array.
 *
 * Example 1:
 *
 * Input: arr = [[1, 2, 3],[4, 5, 0]]
 * Output: 2.50000*/
public class AvgOfAllElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}};
        findAverage2D(arr);
    }

    private static double findAverage2D(int[][] arr) {
        double avg = 0;
        int totalElements = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++){
            for (int j =0; j < arr[i].length; j++) {
                sum += arr[i][j];
                totalElements++;

            }
        }
        System.out.println((double) sum / totalElements);


        return (double) sum / totalElements;
    }
}
