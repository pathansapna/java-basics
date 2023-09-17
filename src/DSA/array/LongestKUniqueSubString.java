package DSA.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Given a string you need to return the size of the longest possible substring that has exactly K unique characters. If there is no possible substring then print -1.
 *
 * Example 1:
 *
 * Input: s = "aabacbebebe", k = 3
 * Output: 7
 * Explanation: "cbebebe" is the longest substring with K distinct characters.*/
public class LongestKUniqueSubString {
    public static void main(String[] args) {
       String s = "aabacbebebe";
       int k = 3;
        longestKSubstr(s, k);
    }
    public static int longestKSubstr(String s, int k) {
        if (s == null || s.length() == 0 || k <= 0) {
            return -1; // Invalid input.
        }

        int maxLength = 0; // Initialize the maximum length to 0.
        int left = 0; // Left pointer of the window.

        Map<Character, Integer> charCount = new HashMap<>(); // Map to store character counts.

        for (int right = 0; right < s.length(); right++) {
            char rightChar = s.charAt(right);
            charCount.put(rightChar, charCount.getOrDefault(rightChar, 0) + 1);

            // Shrink the window until there are more than K unique characters.
            while (charCount.size() > k) {
                char leftChar = s.charAt(left);
                charCount.put(leftChar, charCount.get(leftChar) - 1);

                if (charCount.get(leftChar) == 0) {
                    charCount.remove(leftChar);
                }

                left++;
            }

            // Update the maximum length if a longer substring is found.
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return (charCount.size() >= k) ? maxLength : -1;
    }
}
