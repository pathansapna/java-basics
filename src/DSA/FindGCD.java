package DSA;

import java.util.Arrays;

/**
 * Given an integer array nums, return**** the greatest common divisor of the smallest number and largest number in nums.
 * <p>
 * The greatest common divisor of two numbers is the largest positive integer that evenly divides both numbers.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,5,6,9,10]
 * Output: 2
 * Explanation: The smallest number in nums is 2.
 * <p>
 * The largest number in nums is 10.
 * <p>
 * The greatest common divisor of 2 and 10 is 2.
 */
public class FindGCD {
    public static void main(String[] args) {
        int[] nums = {2, 5, 6, 9, 10};
        findGCD(nums);

    }

    public static int findGCD(int[] nums) {

        Arrays.sort(nums);
        int min = nums[0];
        int max = nums[nums.length - 1];
        int result = min;
        while(result > 0) {
            if (max % result == 0 && min % result == 0) {
                break;
            }
            result--;
        }
            return result;

    }
}
