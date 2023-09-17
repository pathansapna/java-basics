package DSA;

/**
 * Given an integer num, return the number of steps to reduce it to zero.
 * <p>
 * In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
 * <p>
 * Example 1:
 * <p>
 * Input: num = 14
 * Output: 6
 * Explanation: Step 1) 14 is even; divide by 2 and obtain 7.
 * <p>
 * Step 2) 7 is odd; subtract 1 and obtain 6.
 * <p>
 * Step 3) 6 is even; divide by 2 and obtain 3.
 * <p>
 * Step 4) 3 is odd; subtract 1 and obtain 2.
 * <p>
 * Step 5) 2 is even; divide by 2 and obtain 1.
 * <p>
 * Step 6) 1 is odd; subtract 1 and obtain 0.
 */
public class NUmberOfStepsToReduceNumberToZero {
    public static void main(String[] args) {
        int num = 14;
        numberOfSteps(num);
    }

    public static int numberOfSteps(int num) {
        int ans = 0;
        for (; num > 0; ans++)
            if (num % 2 == 1) num--;
            else num /= 2;
        return ans;
    }
}
