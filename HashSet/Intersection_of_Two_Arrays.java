// Problem 349: Intersection of Two Arrays
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use HashSets to efficiently find the
// unique common elements between two arrays.
//
// Key Observation:
// - The result should contain only distinct elements.
// - A HashSet provides O(1) average-time lookup.
//
// Steps:
// 1. Store all elements of nums1 in a HashSet.
// 2. Traverse nums2:
//      - If an element exists in the first set,
//        add it to the result set.
// 3. Convert the result set into an array.
// 4. Return the final array.
//
// Example:
// Input:
// nums1 = [1,2,2,1]
// nums2 = [2,2]
//
// Common distinct elements:
// [2]
//
// Output:
// [2]
//
// Time Complexity: O(n + m)
// n = nums1.length
// m = nums2.length
//
// Space Complexity: O(n + k)
// k = number of unique common elements

import java.util.*;

class Solution {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> set1 = new HashSet<>();

        Set<Integer> result = new HashSet<>();

        // Store elements of nums1
        for (int num : nums1) {

            set1.add(num);
        }

        // Find common elements
        for (int num : nums2) {

            if (set1.contains(num)) {

                result.add(num);
            }
        }

        // Convert set to array
        int[] ans = new int[result.size()];

        int i = 0;

        for (int num : result) {

            ans[i++] = num;
        }

        return ans;
    }
}
