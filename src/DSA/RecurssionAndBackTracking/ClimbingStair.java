package DSA.RecurssionAndBackTracking;

/**
 * You are climbing a staircase. It takes n steps to reach the top.
 * <p>
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 */
public class ClimbingStair {
    public static void main(String[] args) {
        int n = 2;
        climbStairs(n);
    }

    public static int climbStairs(int n) {
        if (n <= 1) {
            return 1; // If there are 0 or 1 steps, there's only one way to climb (no steps or one step).
        }

        int[] step = new int[n + 1]; // Create an array to store the number of ways to reach each step.
        step[0] = 1; // There's one way to reach step 0 (no steps).
        step[1] = 1; // There's one way to reach step 1 (one step).

        for (int i = 2; i <= n; i++) {
            step[i] = step[i - 1] + step[i - 2]; // Number of ways to reach step i is the sum of ways to reach i-1 and i-2.
        }

        return step[n];
    }
}
