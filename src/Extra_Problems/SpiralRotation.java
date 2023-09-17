package Extra_Problems;

/**
 * Given a 2D integer array of size N x M, the task is to print the elements of the array in a spiral form. The elements should be printed in the order followed for every iteration:
 *
 * First row (left to right)
 * Last column (top to bottom)
 * Last row (right to left)
 * First column (bottom to top)
 * Note: Every element will be printed only once.
 *
 * Example 1:
 *
 * Input: arr = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
 * Output: 1 2 3 4 8 12 11 10 9 5 6 7*/
public class SpiralRotation {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        printSpiral(arr);

    }public static void printSpiral(int[][] arr) {
        for (int i=0; i< 3; i++){
            for (int j=0; j < 4; j++){

                System.out.print(arr[i][j]+ " ");
            }
        }
    }

}
