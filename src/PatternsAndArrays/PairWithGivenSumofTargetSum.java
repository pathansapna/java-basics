package PatternsAndArrays;

/**
 * Given an array of integers and a target sum, return the first pair of integers that add up to the target sum.
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [1,2,3,4], targetSum = 4
 * Output: [1,3]
 */

public class PairWithGivenSumofTargetSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int targetSum = 4;
        findPairWithGivenSum(arr, targetSum);
    }

    private static int[] findPairWithGivenSum(int[] arr, int targetSum) {
        int[] output = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            // start from the i'th element until the last element
            for (int j = i + 1; j < arr.length; j++) {
                // if the desired sum is found, print it
                if (arr[i] + arr[j] == targetSum) {
//                    System.out.printf( arr[i], arr[j]);

                    output[0] = arr[i];
                    output[1] = arr[j];

                }
            }
        }
        return output;
    }
}
