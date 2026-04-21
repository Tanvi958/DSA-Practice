// Problem 28: Find the Index of the First Occurrence in a String
// Platform: LeetCode
// Difficulty: Easy

// Approach (Brute Force - 2 Loops):
// Use two loops to compare substring of haystack with needle
// Outer loop selects starting index in haystack
// Inner loop checks character-by-character match with needle
// If all characters match → return starting index
// If mismatch → move to next index

// Time Complexity: O(n * m)
// Space Complexity: O(1)

package String;

public class First_Occurrence {
    public int strStr(String haystack, String needle) {
        int n = haystack.length();
        int m = needle.length();

        if (m == 0) return 0;

        for (int i = 0; i <= n - m; i++) {
            int j;

            for (j = 0; j < m; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == m) {
                return i; // match found
            }
        }

        return -1; // not found
    }
}


