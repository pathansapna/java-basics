package Extra_Problems;
/**
 * Sara loves patterns, today she encounters an interesting pattern and wants to write a code that can print the pattern of a given height N. As Sara is weak in programming help her to code it.
 *
 * The pattern for height 6 will be :-
 *
 * 0 4 8 12 16 20
 * 24 28 32 36 40 44
 * 48 52 56 60 64 68
 * 72 76 80 84 88 92
 * 96 100 104 108 112 116
 * 120 124 128 132 136 140
 * Example 1:
 *
 * Input: N = 3
 * Output:
 * 0 4 8
 * 12 16 20
 * 24 28 32 */
public class SaraAndPatterns {
    public static void main(String[] args) {
        int N = 3;
        pattern(N);
    }
    public static void pattern(int N) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int value = i * N * 4 + j * 4;
                System.out.print(value + " ");
            }
            System.out.println();  // Move to the next line after completing each row
        }
    }
}
