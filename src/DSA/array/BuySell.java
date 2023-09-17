package DSA.array;
/**
 * You are given an array prices where prices[i] is the price of a given stock on the ith day.
 *
 * You want to maximize your profit by choosing a single day to buy one stock and choosing a different day in the future to sell that stock.
 *
 * Return the maximum profit you can achieve from this transaction. If you cannot achieve any profit, return 0.
 *
 * Example 1:
 *
 * Input: prices = [7,1,5,3,6,4]
 * Output: 5
 * Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
 *
 * Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.*/
public class BuySell {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        maxProfit(prices);
    }
    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0; // Cannot make a profit with less than two days or no data.
        }
        int minPrice = prices[0]; // Initialize the minimum price as the price on the first day.
        int maxProfit = 0; // Initialize the maximum profit as 0.

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i]; // Update the minimum price if a lower price is encountered.
            } else {
                // Calculate the profit by selling at the current day's price.
                int profit = prices[i] - minPrice;
                if (profit > maxProfit) {
                    maxProfit = profit; // Update the maximum profit if a higher profit is obtained.
                }
            }
        }
        System.out.println(maxProfit);
        return maxProfit;
    }
}
