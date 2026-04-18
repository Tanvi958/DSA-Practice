// Problem 32: Longest Valid Parentheses
// Platform: LeetCode
// Difficulty: Hard

// Approach:
// We use a two-pass scanning technique without extra space.
// First, traverse from left to right, counting '(' as left and ')' as right.
// When left == right, we update maxLength.
// If right > left, reset counters since the substring becomes invalid.
// Then, traverse from right to left to handle cases where '(' are extra.
// Similarly, update maxLength when left == right and reset when left > right.
// This ensures we capture all valid substrings in both directions.

// Time Complexity: O(n)
// Space Complexity: O(1)

package String;

 class Longest_Valid_Parentheses 
 {
    public int longestValidParentheses(String s) 
    {
        int left = 0, right = 0, maxLength = 0;

        // Left to Right
        for (int i = 0; i < s.length(); i++) 
        {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLength = Math.max(maxLength, 2 * right);
            } else if (right > left) {
                left = right = 0;
            }
        }

        // Reset counters
        left = right = 0;

        // Right to Left
        for (int i = s.length() - 1; i >= 0; i--) 
        {
            if (s.charAt(i) == '(') left++;
            else right++;

            if (left == right) {
                maxLength = Math.max(maxLength, 2 * left);
            } else if (left > right) {
                left = right = 0;
            }
        }

        return maxLength;
    }
}   

