package DSA.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.
 * <p>
 * A subarray is a contiguous non-empty sequence of elements within an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,1], k = 2
 * Output: 2
 * Explanation:
 */
public class SubarraySumEqlK {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1};
        int k = 2;
        subarraySum(nums, k);
    }

    public static int subarraySum(int[] nums, int k) {
        int count = 0; // Initialize the count of subarrays.
        int sum = 0; // Initialize the cumulative sum.

        // Create a HashMap to store cumulative sum frequencies.
        Map<Integer, Integer> sumFreq = new HashMap<>();
        sumFreq.put(0, 1); // Initialize with a sum of 0 (empty subarray).

        for (int num : nums) {
            sum += num; // Calculate the cumulative sum.

            // Check if (sum - k) exists in the map. If yes, increment the count.
            if (sumFreq.containsKey(sum - k)) {
                count += sumFreq.get(sum - k);
            }

            // Update the cumulative sum frequency in the map.
            sumFreq.put(sum, sumFreq.getOrDefault(sum, 0) + 1);
        }

        System.out.println(count);
        return count;
    }
}
