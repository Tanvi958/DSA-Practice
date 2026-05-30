// Problem 70: Climbing Stairs
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use Dynamic Programming with Memoization.
//
// Key Observation:
// - To reach the nth stair, we can come from:
//      (n - 1)th stair by taking 1 step
//      (n - 2)th stair by taking 2 steps
//
// Therefore:
//      ways(n) = ways(n - 1) + ways(n - 2)
//
// Steps:
// 1. Create a memoization array to store
//    previously computed results.
// 2. Use recursion to calculate the number
//    of ways to reach the nth stair.
// 3. If the result is already computed,
//    return it from the memo array.
// 4. Otherwise, compute and store it.
// 5. Return the final answer.
//
// Base Cases:
// - n = 0 → 1 way
// - n = 1 → 1 way
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int climbStairs(int n) {

        int[] memo = new int[n + 1];

        return helper(n, memo);
    }

    private int helper(int n, int[] memo) {

        // Base cases
        if (n == 0 || n == 1) {

            return 1;
        }

        // Return already computed result
        if (memo[n] != 0) {

            return memo[n];
        }

        // Store and return result
        memo[n] = helper(n - 1, memo) + helper(n - 2, memo);

        return memo[n];
    }
}
