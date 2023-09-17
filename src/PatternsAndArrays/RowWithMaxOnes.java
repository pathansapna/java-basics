package PatternsAndArrays;
/**
 * Given a binary matrix, you have to find the row with the maximum number of 1s. If there are more than one rows with maximum one's then return the first one.
 *
 * Example 1:
 *
 * Input: arr = [[1,1,1],[0,0,0],[0,0,0]], r = 3, c = 3
 * Output: 0*/
public class RowWithMaxOnes {
    public static void main(String[] args) {
        int[][] arr = {{1,1,1,},{0,0,0},{0,0,0}};
        int r =3;
        int c = 3;
        maximumOnesRow(arr, r, c);
    }

    private static int maximumOnesRow(int[][] arr, int r, int c) {
        int maxOnesRow = 0;
        int maxOnesCount = 0;

        for (int i = 0; i < r; i++){
            int count = 0;
            for (int j = 0; j < c; j++){
                if (arr[i][j] == 1){
                    count++;
                }

            }
            if (count > maxOnesCount) {
                maxOnesCount = count;
                maxOnesRow = i;
            }
        }
        return maxOnesRow;
    }
}
