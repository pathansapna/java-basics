package DSA.array;

import java.util.Arrays;

/**
 * "Given an array A[] of size N containing non-negative integers. You have to move all 0's to the end of array while maintaining the relative order of the non-zero elements.
 * <p>
 * Note:
 * <p>
 * You must do this in-place without making a copy of the array.
 * <p>
 * Minimize the total number of operations."
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [0,1,0,3,12]
 * Output: [1,3,12,0,0]
 */
public class MoveZeros {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeros(nums);
    }

    public static int[] moveZeros(int[] nums) {
        int count = 0;  // Count of non-zero elements

        // Traverse the array. If element encountered is
        // non-zero, then replace the element at index 'count'
        // with this element
        for (int i = 0; i < nums.length; i++)
            if (nums[i] != 0)
                nums[count++] = nums[i]; // here count is
        // incremented

        // Now all non-zero elements have been shifted to
        // front and 'count' is set as index of first 0.
        // Make all elements 0 from count to end.
        while (count < nums.length)
            nums[count++] = 0;
        System.out.println(Arrays.toString(nums));
        return nums;
    }
}
