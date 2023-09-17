package DSA;
/**
 * Given a positive integer n, find the pivot integer x such that:
 *
 * The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
 * Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
 *
 * Example 1:
 *
 * Input: n = 8
 * Output: 6
 * Explanation: 6 is the pivot integer since: 1 + 2 + 3 + 4 + 5 + 6 = 6 + 7 + 8 = 21.*/
public class FindPivotInteger {
    public static void main(String[] args) {
        int n = 8;
        pivotInteger(n);
    }
    public static int pivotInteger(int n) {
        int total = (n * ( n+1))/ 2;
        int sum = 0;
        for (int i = 1; i <=n ; i++){
            sum += i;
            if (sum == (total - sum + i)){
                return i;
            }
        }
        return -1;
    }
}
