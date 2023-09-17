package DSA.array;

import java.util.Arrays;

/**
 * Given an array nums of n integers . Find the maximum number from an array.
 *
 * Example 1:
 *
 * Input : nums=[1,20,-10,30]
 * Output: 30
 * The maximum element from an array is 30
 * Example 2:
 *
 * Input: nums=[-10,-20,0,-30,5]
 * Output:5*/
public class LargestElementInArray {
    public static void main(String[] args) {

        int[] nums= {-10,-20,0,-30,5};
        findLargestElement(nums);
    }
    public static int findLargestElement(int[] nums) {
        int ans= nums[0];
        for (int i = 1; i < nums.length; i++){
            if(nums[i] > 0){
                if( nums[i] >= ans) {
                    ans = nums[i];
                }
            }

        }
        System.out.println(ans);
        return ans;
       /* Arrays.sort(nums);
        return nums[nums.length-1];*/
    }
}
