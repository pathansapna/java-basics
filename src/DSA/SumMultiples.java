package DSA;

/**
 * Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
 * <p>
 * Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
 * <p>
 * Example 1:
 * 1,2,3,4,5,6,7
 * Input: n = 7
 * Output: 21
 * Explanation: ```markdown
 * Numbers in the range [1, 7] that are divisible by 3, 5, or 7 are 3, 5, 6, 7. The sum of these numbers is 21.
 */
public class SumMultiples {
    public static void main(String[] args) {
        int n = 7;
        sumOfMultiples(n);
    }

    public static int sumOfMultiples(int n) {
        int a = 3, b = 5, c= 7;
        int sum = 0;
        for (int i = 0 ; i <= n; i++){
            if (i % a == 0 || i % b == 0 || i % c == 0){
                sum += i;
            }
        }
        return sum;
    }
}
