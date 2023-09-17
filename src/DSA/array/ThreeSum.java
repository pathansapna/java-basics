package DSA.array;

import java.util.*;

/**
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.
 * <p>
 * Notice that the solution set must not contain duplicate triplets.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 * Explanation:
 * nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
 * nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
 * nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
 * The distinct triplets are [-1,0,1] and [-1,-1,2].
 * Notice that the order of the output and the order of the triplets does not matter.
 */
public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        threeSum(nums);
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        if (nums == null || nums.length < 3) {
            return result; // Not enough elements to form a triplet.
        }

        Set<Integer> seen = new HashSet<>();
        Set<List<Integer>> triplets = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int target = -nums[i];
            Set<Integer> used = new HashSet<>();

            for (int j = i + 1; j < nums.length; j++) {
                int complement = target - nums[j];

                if (used.contains(complement)) {
                    List<Integer> triplet = Arrays.asList(nums[i], complement, nums[j]);
                    triplet.sort(null);
                    triplets.add(triplet);
                }

                used.add(nums[j]);
            }

            seen.add(nums[i]);
        }

        result.addAll(triplets);
        return result;
    }
}
