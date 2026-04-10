// Problem: Longest Substring Without Repeating Characters
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// Use Sliding Window + HashSet
// Expand window using 'right'
// If duplicate found, shrink window using 'left'

// Time Complexity: O(n)
// Space Complexity: O(min(n, charset))

package Two_Pointer;

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        
        int left = 0, maxLength = 0;
        
        for (int right = 0; right < s.length(); right++) {
            
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}