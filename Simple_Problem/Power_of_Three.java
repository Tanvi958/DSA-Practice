// Problem 326: Power of Three
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// A number is a power of 3 if it can be repeatedly
// divided by 3 and eventually becomes 1.
//
// Examples:
// 3   = 3¹
// 9   = 3²
// 27  = 3³
// 81  = 3⁴
//
// Steps:
// 1. If n is 0, return false because 0 is not
//    a power of 3.
// 2. While n is divisible by 3:
//      - Divide n by 3.
// 3. After all divisions:
//      - If n becomes 1, it is a power of 3.
//      - Otherwise, it is not.
// 4. Return the result.
//
// Example:
// Input: n = 27
//
// 27 → 9 → 3 → 1
//
// Output: true
//
// Time Complexity: O(log₃ n)
// Space Complexity: O(1)

class Solution {

    public boolean isPowerOfThree(int n) {

        // 0 is not a power of 3
        if (n == 0) {

            return false;
        }

        // Repeatedly divide by 3
        while (n % 3 == 0) {

            n /= 3;
        }

        // Check if reduced to 1
        return n == 1;
    }
}
