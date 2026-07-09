// Problem 122: Best Time to Buy and Sell Stock II
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use a Greedy approach.
//
// Key Observation:
// - We can complete as many transactions as we want.
// - Every time the stock price increases from one day
//   to the next, we can take that profit.
// - Adding all positive differences gives the maximum
//   possible profit.
//
// Steps:
// 1. Initialize profit = 0.
// 2. Traverse the prices array from index 1.
// 3. If prices[i] > prices[i - 1]:
//      - Add the difference to profit.
// 4. Return the total profit.
//
// Example:
// Input:
// prices = [7,1,5,3,6,4]
//
// Profit:
// (5 - 1) + (6 - 3)
// = 4 + 3
// = 7
//
// Output:
// 7
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int maxProfit(int[] prices) {

        int profit = 0;

        for (int i = 1; i < prices.length; i++) {

            if (prices[i] > prices[i - 1]) {

                profit += prices[i] - prices[i - 1];
            }
        }

        return profit;
    }
}
