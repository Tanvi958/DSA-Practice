// Problem 796: Rotate String
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// A string can be rotated by moving characters
// from the front to the back.
//
// Key Observation:
// - If goal is a valid rotation of s,
//   then goal will always be a substring of s + s.
//
// Example:
// s = "abcde"
// s + s = "abcdeabcde"
//
// Possible rotations present inside:
// "bcdea", "cdeab", "deabc", "eabcd", "abcde"
//
// Steps:
// 1. Check if both strings have equal length.
//      - If not, return false.
// 2. Concatenate s with itself.
// 3. Check whether goal exists inside the new string.
// 4. If yes, return true; otherwise return false.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public boolean rotateString(String s, String goal) {

        // Lengths must be equal
        if (s.length() != goal.length()) {

            return false;
        }

        // Concatenate string with itself
        String result = s + s;

        // Check if goal is a substring
        return result.contains(goal);
    }
}
```
