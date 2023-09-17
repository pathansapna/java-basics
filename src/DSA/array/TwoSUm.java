package DSA.array;

import java.util.Arrays;

/**Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

 You may assume that each input would have exactly one solution, and you may not use the same element twice.

 You can return the answer in any order.

 Example 1:

 Input: nums = [2,7,11,15], target = 9
 Output: [0,1]
 Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSUm {
    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;
        twoSum(nums, target);
    }
    public static int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < nums.length; j++) {
                // if the desired sum is found, print it
                if (nums[i] + nums[j] == target) {
//                    System.out.printf( arr[i], arr[j]);

                    output[0] = i;
                    output[1] = j;

                }
            }
        }
        System.out.println(Arrays.toString(output));
        return output;
    }
}
