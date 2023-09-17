package DSA.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s. You may return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * <p>
 * Example 1:
 * <p>
 * Input: s = "cbaebabacd", p = "abc"
 * Output: [0,6]
 * Explanation: The substring with start index = 0 is "cba", which is an anagram of "abc".
 * <p>
 * The substring with start index = 6 is "bac", which is an anagram of "abc".
 */
public class FindAllANagramInString {
    public static void main(String[] args) {
        String s = "cbaebabacd", p = "abc";
        findAnagrams(s, p);
    }

    public static List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s == null || s.length() < p.length()) {
            return result;
        }

        Map<Character, Integer> pMap = new HashMap<>();
        Map<Character, Integer> windowMap = new HashMap<>();

        // Initialize the frequency map for the pattern.
        for (char c : p.toCharArray()) {
            pMap.put(c, pMap.getOrDefault(c, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int count = pMap.size(); // Number of distinct characters to match.

        while (right < s.length()) {
            char charRight = s.charAt(right);

            // Update the frequency map for the current window.
            windowMap.put(charRight, windowMap.getOrDefault(charRight, 0) + 1);

            // Check if the character in the window matches the pattern.
            if (pMap.containsKey(charRight) && windowMap.get(charRight).intValue() == pMap.get(charRight).intValue()) {
                count--;
            }

            // When the window size equals the pattern size, check for an anagram.
            if (right - left + 1 == p.length()) {
                if (count == 0) {
                    result.add(left); // Found an anagram, add the left index to the result.
                }

                char charLeft = s.charAt(left);

                // Update the frequency map for the left character.
                windowMap.put(charLeft, windowMap.get(charLeft) - 1);

                // If the frequency of the left character becomes less than the pattern, increment count.
                if (pMap.containsKey(charLeft) && windowMap.get(charLeft).intValue() == pMap.get(charLeft).intValue() - 1) {
                    count++;
                }

                left++; // Move the left pointer to shrink the window.
            }

            right++; // Move the right pointer to expand the window.
        }

        return result;
    }
}
