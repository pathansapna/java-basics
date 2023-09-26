package DSA.MathsForCoding;
/**
 * Given an integer n, return an array ans of length n + 1 such that for each i** (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 * Example 1:
 * Input: n = 2
 * Output: [0,1,1]
 * Explanation: 0 --> 0
 * 1 --> 1
 * 2 --> 10*/
public class CountingBits {
    public static void main(String[] args) {
        int n = 2;
        countBits(n);
    }

    public static int[] countBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            ans[i] = countOnes(i);
        }
        return ans;
    }

    private static int countOnes(int num) {
        int count = 0;
        while (num > 0) {
            count += num & 1; // Count the rightmost bit
            num >>= 1;       // Shift right to check the next bit
        }
        return count;
    }
}
