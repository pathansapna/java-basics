package PatternsAndArrays;
/**
 * Output:
 * 1 2 3 4
 * 2 4 6 8
 * 3 6 9 12
 * 4 8 12 16
 *
 * Write a program that prints out a times table for the numbers 1 through n, where n is an integer entered by the user.*/
public class NumberPatternPrinting {
    public static void main(String[] args) {
        int n = 4;
        timesTable(n);

    }

    private static void timesTable(int n) {
        int table = 0;
        for (int i = 1; i<= n; i++){
            for (int j = 1; j <= n ; j++) {
                table = i * j;
                System.out.print(table + " ");
            }
            System.out.println();
        }
    }
}
