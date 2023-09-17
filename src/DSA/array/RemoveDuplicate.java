package DSA.array;

import java.util.ArrayList;
import java.util.List;

/**
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates  such that each unique element appears only once and return the new array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,1,2]
 * Output: [1,2]
 * Explanation: Array after removing duplicates are [1,2]
 */
public class RemoveDuplicate {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(1);
        nums.add(2);
        removeDuplicates(nums);
    }

    public static List<Integer> removeDuplicates(List<Integer> nums) {
        List<Integer> newArr = new ArrayList<>();
        for (int i : nums) {
            if (!newArr.contains(i)) {
                newArr.add(i);
            }
        }
        System.out.println(newArr);
        return newArr;
    }
}
