package DSA;

import java.util.Arrays;

/**You are given a positive integer num consisting of exactly four digits. Split num into two new integers new1 and new2 by using the digits found in num. Leading zeros are allowed in new1 and new2, and all the digits found in num must be used.

 For example, given num = 2932, you have the following digits: two 2's, one 9 and one 3. Some of the possible pairs [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
 Return the minimum possible sum of new1 and new2

 Example 1:

 Input: num = 2932
 Output: 52
 Explanation: Some possible pairs [new1, new2] are [29, 23], [223, 9], etc.

 The minimum sum can be obtained by the pair [29, 23]: 29 + 23 = 52.*/
public class MinSumOfFourDigitNumAfterSplit {
    public static void main(String[] args) {
        int num = 2932;
        minimumSum(num);
    }
    public static int minimumSum(int num) {
        int[] arr = new int[4];
        String s = String.valueOf(num);
        int i = 0;

        for (char c : s.toCharArray()){
            arr[i++] = c - '0';
        }
        Arrays.sort(arr);
        int d1 = arr[0], d2 = arr[1], d3 = arr[2], d4 = arr[3];
        String n1 = "" + d1 + d3, n2 = "" + d2 + d4;
        System.out.println(Integer.parseInt(n1) + Integer.parseInt(n2));
        return Integer.parseInt(n1) + Integer.parseInt(n2);
    }
}
