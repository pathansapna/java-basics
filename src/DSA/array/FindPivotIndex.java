package DSA.array;
/**
 * Given an array of integers nums, calculate the pivot index of this array.
 *
 * The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 *
 * If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 *
 * Return the leftmost pivot index. If no such index exists, return -1.
 *
 * Example 1:
 *
 * Input: nums = [1,7,3,6,5,6]
 * Output: 3
 * Explanation: The pivot index is 3.
 *
 * Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
 *
 * Right sum = nums[4] + nums[5] = 5 + 6 = 11*/
public class FindPivotIndex {
    public static void main(String[] args) {
        int[] nums = {1,7,3,6,5,6};
        pivotIndex(nums);
    }
    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // Calculate the total sum of all elements in the array.
        for (int num : nums) {
            totalSum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            // If the left sum is equal to the right sum, return the current index as the pivot index.
            if (leftSum == totalSum - leftSum - nums[i]) {
                System.out.println(i);
                return i;
            }
            leftSum += nums[i];
        }
        return -1;
    }
}
