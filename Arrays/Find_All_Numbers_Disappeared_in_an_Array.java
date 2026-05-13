// Problem 448: Find All Numbers Disappeared in an Array
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use a frequency array to track which numbers are present.
//
// Since the array contains numbers from 1 to n:
// - If a number appears, we increment its frequency.
// - After counting, any number with frequency 0
//   is missing from the array.
//
// Steps:
// 1. Create a frequency array of size n + 1.
// 2. Count occurrences of each number in nums.
// 3. Traverse from 1 to n:
//      - If freq[i] == 0, add i to the result list.
// 4. Return the list of missing numbers.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

import java.util.*;

class Solution {

    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        int[] freq = new int[n + 1];

        List<Integer> list = new ArrayList<>();

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        // Find missing numbers
        for (int i = 1; i < freq.length; i++) {

            if (freq[i] == 0) {
                list.add(i);
            }
        }

        return list;
    }
}
