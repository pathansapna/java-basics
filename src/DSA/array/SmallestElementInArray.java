package DSA.array;
/**
 * Given an array of integers . Find the smallest element in the array.
 *
 * Example 1:
 *
 * Input: nums = [-10,1,5,6,-11]
 * Output: -11
 * Explanation: Smallest element is -11.*/
public class SmallestElementInArray {
    public static void main(String[] args) {
        int[] nums = {-10,1,5,6,-11};
        findSmallest(nums);
    }
    public static int findSmallest(int[] nums) {
        int min = nums[0];
        for (int i = 0; i < nums.length; i++){
            if(nums[i] <= min){
                min = nums[i];
            }
        }
        return min;
    }
}
