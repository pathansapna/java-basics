package PatternsAndArrays;
/**
 * Write a program that searches for a given element in a two-dimensional array (matrix). The function should return a boolean value indicating whether the element was found in the matrix or not.
 *
 * Example 1:
 *
 * Input: arr = [ [1, 2, 3], [4, 5, 6], [7, 8, 9] ], target = 5
 * Output: true*/
public class SearchingAnElementIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6},{7,8,9}};
        int target = 5;
        searchMatrix(arr, target);
    }

    private static boolean searchMatrix(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j <arr[i].length; j++){
                if (arr[i][j] == target)
                    return true;
            }
        }
        return false;
    }
}
