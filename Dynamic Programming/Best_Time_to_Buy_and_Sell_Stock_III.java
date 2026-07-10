// Problem 123: Best Time to Buy and Sell Stock III
// Platform: LeetCode
// Difficulty: Hard

// Approach:
// We use Dynamic Programming with state tracking
// to allow at most two transactions.
//
// Variables:
// buy1  -> Maximum profit after first buy
// sell1 -> Maximum profit after first sell
// buy2  -> Maximum profit after second buy
// sell2 -> Maximum profit after second sell
//
// Key Observation:
// - A transaction consists of one buy and one sell.
// - We can perform at most two transactions.
// - Update each state while traversing prices.
//
// Steps:
// 1. Initialize:
//      buy1 = -prices[0]
//      sell1 = 0
//      buy2 = -prices[0]
//      sell2 = 0
// 2. For each price:
//      buy1  = max(buy1, -price)
//      sell1 = max(sell1, buy1 + price)
//      buy2  = max(buy2, sell1 - price)
//      sell2 = max(sell2, buy2 + price)
// 3. sell2 stores the maximum profit after
//    at most two transactions.
// 4. Return sell2.
//
// Example:
// Input:
// prices = [3,3,5,0,0,3,1,4]
//
// Output:
// 6
//
// Explanation:
// Buy at 0, Sell at 3  -> Profit = 3
// Buy at 1, Sell at 4  -> Profit = 3
// Total Profit = 6
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int maxProfit(int[] prices) {

        int buy1 = Integer.MIN_VALUE;
        int sell1 = 0;

        int buy2 = Integer.MIN_VALUE;
        int sell2 = 0;

        for (int price : prices) {

            buy1 = Math.max(buy1, -price);

            sell1 = Math.max(sell1, buy1 + price);

            buy2 = Math.max(buy2, sell1 - price);

            sell2 = Math.max(sell2, buy2 + price);
        }

        return sell2;
    }
}
