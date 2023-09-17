package PatternsAndArrays;
/**
Output: ***
        **
        *
 */
public class StarPatternReverse {
    public static void main(String[] args){
        int n = 4;
        star(n);

    }

    private static void star(int n) {
        for (int i = 1; i <= n; i++){
            for (int j = n; j >= i; j--){
                System.out.print( "*");
            }
            System.out.println();
        }
    }
}

