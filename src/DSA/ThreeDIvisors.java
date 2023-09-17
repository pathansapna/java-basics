package DSA;

import java.util.Arrays;

/**
 * Given an integer n, return true if n has exactly three positive divisors. Otherwise, return false.
 * <p>
 * An integer m is a divisor of n if there exists an integer k such that n = k * m.
 * <p>
 * Example 1:
 * <p>
 * Input: n = 2
 * Output: false
 * Explanation:  2 has only two divisors: 1 and 2.
 */
public class ThreeDIvisors {
    public static void main(String[] args) {
        int n = 2;
        isThree(n)
        ;
    }

    public static boolean isThree(int n) {
        int sqrt = (int) Math.sqrt(n);
        if (sqrt * sqrt != n)
            return false;
        int divisors = 1;
        for (int i = 1; i < sqrt; i++) {
            if (n % i == 0)
                divisors += 2;
        }
        return divisors == 3;
    }
}
