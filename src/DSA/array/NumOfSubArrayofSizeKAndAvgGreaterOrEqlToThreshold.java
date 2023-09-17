package DSA.array;

/**
 * Given an array of integers arr and two integers k and threshold, return the number of sub-arrays of size k and average greater than or equal to threshold.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: arr = [2,2,2,2,5,5,5,8], k = 3, threshold = 4
 * Output: 3
 * Explanation: Sub-arrays [2,5,5],[5,5,5] and [5,5,8] have averages 4, 5 and 6 respectively. All other sub-arrays of size 3 have averages less than 4 (the threshold).
 */
public class NumOfSubArrayofSizeKAndAvgGreaterOrEqlToThreshold {
    public static void main(String[] args) {
        int[] arr = {2, 2, 2, 2, 5, 5, 5, 8};
        int k = 3, threshold = 4;
        numOfSubarrays(arr, k, threshold);
    }

    public static int numOfSubarrays(int[] arr, int k, int threshold) {
        int count = 0;
        int sum = 0;

        // Calculate the initial sum of the first k elements.
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }

        // Check if the initial average is greater than or equal to the threshold.
        if (sum / k >= threshold) {
            count++;
        }

        // Iterate through the array to calculate the sum of subarrays and count valid subarrays.
        for (int i = k; i < arr.length; i++) {
            sum += arr[i] - arr[i - k]; // Update the sum by adding the new element and subtracting the old one.

            if (sum / k >= threshold) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }
}
