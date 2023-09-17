package DSA.array;

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * <p>
 * You must implement a solution with a linear runtime complexity and use only constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,2,1]
 * Output: 1
 */
public class SIngleNumber {
    public static void main(String[] args) {
        int[] nums = {4, 4, 5, 2, 2};
        singleNumber(nums);
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        System.out.println(result);
        return result;
    }
}
