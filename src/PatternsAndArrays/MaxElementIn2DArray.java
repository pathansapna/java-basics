package PatternsAndArrays;

public class MaxElementIn2DArray {
    public static void main(String[] args) {
        int[][] arg = {{1, 2, 3},{4, 5, 6},{7, 8, 9}};
        max(arg);
    }

    private static int max(int[][] arg) {
        int maxElement = arg[0][0];

        for (int i = 0; i < arg.length; i++) {
            for (int j = 0; j < arg[i].length; j++) {
                if (arg[i][j] > maxElement) {
                    maxElement = arg[i][j];
                }
            }
        }

        return maxElement;
    }
}
