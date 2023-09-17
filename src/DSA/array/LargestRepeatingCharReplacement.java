package DSA.array;

/**
 * You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.
 * <p>
 * Return the length of the longest substring containing the same letter you can get after performing the above operations.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "ABAB", k = 2
 * Output: 4
 * Explanation: Replace the two 'A's with two 'B's or vice versa.
 */
public class LargestRepeatingCharReplacement {
    public static void main(String[] args) {
        String s = "ABAB";
        int k = 2;
        characterReplacement(s, k);
    }

    public static int characterReplacement(String s, int k) {
        int maxCount = 0; // Maximum character count in the current window.
        int left = 0; // Left pointer of the window.
        int result = 0; // Length of the longest substring.

        int[] charCount = new int[26]; // Array to store character counts.

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount[rightChar - 'A']++; // Update character count.

            // Update the maximum character count in the current window.
            maxCount = Math.max(maxCount, charCount[rightChar - 'A']);

            // If the number of operations needed to change characters is greater than k, shrink the window.
            if (right - left + 1 - maxCount > k) {
                char leftChar = s.charAt(left);
                charCount[leftChar - 'A']--; // Remove the left character from the window.
                left++;
            }

            // Update the result with the length of the current substring.
            result = Math.max(result, right - left + 1);
        }
        System.out.println(result);
        return result;
    }
}
