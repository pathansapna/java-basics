package DSA.array;
/**
 * Given a binary string s of 0's and 1's. The task is to find the maximum difference between the number of 0s and the number of 1s (number of 0s — number of 1s) for a substring . In case of all 1s print -1.
 *
 * Example 1:
 *
 * Input: s = "11000010001"
 * Output: 6
 * Explanation: From index 2 to index 9, there are 7
 *
 * 0s and 1 1s, so number of 0s - number
 *
 * of 1s is 6.*/
public class MaxDiffOfZerosANdOnesInBinaryString {
    public static void main(String[] args) {
        String s = "11000010001";
        getMaxDifference(s);
    }
    public static int getMaxDifference(String s) {
        int maxDiff = 0;
        int currentDiff = 0;

        for (char c : s.toCharArray()) {
            if (c == '0') {
                currentDiff++;
            } else {
                currentDiff--;
            }

            // Update the maximum difference if the current difference is greater.
            maxDiff = Math.max(maxDiff, currentDiff);

            // Reset the current difference to 0 if it becomes negative.
            if (currentDiff < 0) {
                currentDiff = 0;
            }
        }

        // If the entire string consists of '1's, return -1.
        if (maxDiff == 0) {
            return -1;
        }
        System.out.println(maxDiff);
        return maxDiff;
    }
}
