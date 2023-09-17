package DSA.array;

import java.util.Arrays;

/**
 * Given an array nums of n elements . Complete the given function and return the reversed array .
 *
 * Example 1:
 *
 * Input: nums=[1,2,3,4]
 * Output: nums=[4,3,2,1]*/
public class ReverseArray {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        reverseArray(nums);
    }
    public static int[] reverseArray(int[] nums) {
        int[] temp = new int[nums.length];

        // Reversal of array using Temporary variable
        for(int i = nums.length - 1; i > -1; i--) {
            // Storing the elements of the input array in reverse order
            temp[nums.length - i - 1] = nums[i];
        }
        return temp;
    }
}
