package PatternsAndArrays;

public class NumberPatterns {
    public static void main(String[] args) {
        int n = 5;
        printPyramid(n);
    }

    private static void printPyramid(int n) {
        for(int i = 1; i<= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
