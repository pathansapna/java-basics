package Extra_Problems;
/**
 * Give integer values M and N. Using the character ‘*’ draw a rectangle of height M and breadth N.
 *
 * Example 1:
 *
 * Input: M = 3, N = 3
 * Output: ***
 * * *
 * ***
* */
public class DrawRectangleUsingStar {
    public static void main(String[] args) {
        int M = 3;
        int N = 3;
        rectangleDraw(M, N);
    }

    public static void rectangleDraw(int M, int N) {
            for (int i = 0; i < M; i++) {
                for (int j = 0; j < N; j++) {
                    if (i == 1 && j == 1 ) {
                        System.out.print(" ");
                    } else {
                        System.out.print("*");
                    }
                }
                System.out.println();  // Move to the next line after completing each row
            }
        }
    }


