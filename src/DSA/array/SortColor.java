package DSA.array;

import java.util.Arrays;


/**
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.
 *
 * We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
 *
 * You must solve this problem without using the library's sort function.
 *
 * Example 1:
 *
 * Input: nums = [2,0,2,1,1,0]
 * Output: [0,0,1,1,2,2]
 * Explanation: */
public class SortColor {
    public static void main(String[] args) {
        int[] nums = {2,0,2,1,1,0};
        sortColors(nums)
;    }
    public static int[] sortColors(int[] nums) {
        int low = 0;  // Index for the next position to put 0.
        int high = nums.length - 1; // Index for the next position to put 2.
        int current = 0; // Current index for iterating through the array.

        while (current <= high) {
            if (nums[current] == 0) {
                swap(nums, current, low);
                current++;
                low++;
            } else if (nums[current] == 2) {
                swap(nums, current, high);
                high--;
            } else {
                current++;
            }
        }
        System.out.println(Arrays.toString(nums));
        return nums;
    }
    private static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
