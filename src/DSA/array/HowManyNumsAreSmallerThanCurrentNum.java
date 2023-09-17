package DSA.array;

import java.util.Arrays;

/**
 * Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
 * <p>
 * Return the answer in an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [8, 1, 2, 2, 3]
 * Output: [4, 0, 1, 1, 3]
 * Explanation: For nums[0]=8 there exist four smaller numbers than it (1, 2, 2 and 3).
 * For nums[1]=1 does not exist any smaller number than it.
 * For nums[2]=2 there exist one smaller number than it (1).
 * For nums[3]=2 there exist one smaller number than it (1).
 * For nums[4]=3 there exist three smaller numbers than it (1, 2 and 2).
 */
public class HowManyNumsAreSmallerThanCurrentNum {
    public static void main(String[] args) {
        int[] nums = {8, 1, 2, 2, 3};
        smallerNumbersThanCurrent(nums);
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j && nums[j] < nums[i]) {
                    count++;
                }
            }
            result[i] = count;
        }
        System.out.println(Arrays.toString(result));
        return result;
    }
}
