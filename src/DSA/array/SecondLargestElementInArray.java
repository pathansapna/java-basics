package DSA.array;

/**
 Given an integer array nums return the second largest element from the array.

 Example 1:

 Input: nums = [5, 1, 4, 6, 6]
 Output: 5
 Explanation: 5 is the second largest element from an array.
 */
public class SecondLargestElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 8, 0, 9, 9};
        secondLargest(nums);

    }

    public static int secondLargest(int[] nums) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        if(nums.length < 2){
            return secMax;
        }
        for (int num : nums){
            if (max < num){
                secMax = max;
                max = num;
            }
            if (max > num && secMax < num){
                secMax = num;
            }
        }
        System.out.println(secMax);
        return secMax;
    }
}
