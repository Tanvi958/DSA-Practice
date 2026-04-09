// Problem: Two Sum
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// Use HashMap to store visited numbers and their indices.
// For each element, check if (target - current) exists.

// Time Complexity: O(n)
// Space Complexity: O(n)
package Arrays;

import java.util.*;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}