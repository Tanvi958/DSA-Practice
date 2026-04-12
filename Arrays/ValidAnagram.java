// Problem 242: Valid Anagram
// Platform: LeetCode
// Difficulty: Easy

// Optimized Approach:
// Use a fixed-size array (size 26) to count frequency of characters
// Increment count for string s
// Decrement count for string t
// If all counts become zero → valid anagram

// Time Complexity: O(n)
// Space Complexity: O(1)  // (constant space for 26 letters)

package Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        
        if (s.length() != t.length()) return false;

        int[] count = new int[26];

        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
            count[t.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }

        return true;
    }
}

/* Array (Better when range is fixed)
Faster → direct indexing (no hashing)
Constant space → O(1) (26 letters)
Simple implementation
Use when: only lowercase/limited characters (like Valid Anagram)


HashMap (Better when range is variable)
Handles any characters (Unicode, symbols)
Flexible size
Use when: characters are unknown/mixed (e.g., "aA@#") */
