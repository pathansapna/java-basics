package DSA.MathsForCoding;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Alice and Bob have a different total number of candies. You are given two integer arrays aliceSizes and bobSizes where aliceSizes[i] is the number of candies of the ith box of candy that Alice has and bobSizes[j] is the number of candies of the jth box of candy that Bob has.
 * Since they are friends, they would like to exchange one candy box each so that after the exchange, they both have the same total amount of candy. The total amount of candy a person has is the sum of the number of candies in each box they have.
 * Return an integer array answer where answer[0] is the number of candies in the box that Alice must exchange, and answer[1] is the number of candies in the box that Bob must exchange. If there are multiple answers, you may return any one of them. It is guaranteed that at least one answer exists.
 * Example 1:
 * Input: aliceSizes = [1,1], bobSizes = [2,2]
 * Output: [1,2]*/
public class FairCandySwap {
    public static void main(String[] args) {
        int[] aliceSizes = {1,1};
        int[] bobSizes = {2,2};
        fairCandySwap(aliceSizes, bobSizes);
    }
    public static int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        int[] answer = new int[2];
        for (int i = 0; i < aliceSizes.length; i++) {
            aliceSum += aliceSizes[i];
        }
        for (int j = 0; j < bobSizes.length; j++) {
            bobSum += bobSizes[j];
        }
        int target = (aliceSum + bobSum) / 2;
        Map<Integer, Boolean> bobCandies = new HashMap<>();
        for (int candy : bobSizes) {
            bobCandies.put(candy, true);
        }

        for (int aliceCandy : aliceSizes) {
            int bobCandy = target - (aliceSum - aliceCandy);
            if (bobCandies.containsKey(bobCandy)) {
                answer[0] = aliceCandy;
                answer[1] = bobCandy;
                break;
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    }
}
