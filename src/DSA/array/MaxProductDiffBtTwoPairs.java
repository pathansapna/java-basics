package DSA.array;

/**
 * The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
 * <p>
 * For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
 * Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
 * <p>
 * Return the maximum such product difference.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,6,2,7,4]
 * Output: 34
 * Explanation: We can choose indices 1 and 3 for the first pair (6, 7) and indices 2 and 4 for the second pair (2, 4).
 * The product difference is (6 * 7) - (2 * 4) = 34.
 * Example 2:
 * <p>
 * Input: nums = [4,2,5,9,7,4,8]
 * Output: 64
 * Explanation: We can choose indices 3 and 6 for the first pair (9, 8) and indices 1 and 5 for the second pair (2, 4).
 * The product difference is (9 * 8) - (2 * 4) = 64.
 */

public class MaxProductDiffBtTwoPairs {
    public static void main(String[] args) {
        int[] nums = {5, 6, 2, 7, 4};
        maxProductDifference(nums);
    }

    public static int maxProductDifference(int[] nums) {
        int max1 = Integer.MIN_VALUE; // Initialize the first maximum element to the smallest possible value.
        int max2 = Integer.MIN_VALUE; // Initialize the second maximum element to the smallest possible value.
        int min1 = Integer.MAX_VALUE; // Initialize the first minimum element to the largest possible value.
        int min2 = Integer.MAX_VALUE; // Initialize the second minimum element to the largest possible value.

        for (int num : nums) {
            if (num > max1) {
                max2 = max1; // Update the second maximum if a new maximum is found.
                max1 = num; // Update the first maximum.
            } else if (num > max2) {
                max2 = num; // Update the second maximum if a new maximum is found.
            }

            if (num < min1) {
                min2 = min1; // Update the second minimum if a new minimum is found.
                min1 = num; // Update the first minimum.
            } else if (num < min2) {
                min2 = num; // Update the second minimum if a new minimum is found.
            }
        }

        // Calculate the maximum product difference.
        int product1 = max1 * max2;
        int product2 = min1 * min2;
        System.out.println(product1 - product2);
        return product1 - product2;
    }
}
