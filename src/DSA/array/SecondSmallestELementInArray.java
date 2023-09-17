package DSA.array;

/**
 * Given an array of integer nums . Find the second smallest element from an array.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,1,4,6]
 * Output: 2
 * Explanation: 2 is the second smallest element from an array.
 */
public class SecondSmallestELementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 0, 0, 4, 6};
        secondSmallest(nums);

    }

    public static int secondSmallest(int[] nums) {
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;
        if(nums.length < 2){
            return secMin;
        }
        for (int num : nums){
            if (min > num){
                secMin = min;
                min = num;
            }
            if (min < num && secMin > num){
                secMin = num;
            }
        }
        System.out.println(secMin);
        return secMin;
    }
}
