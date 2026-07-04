// Problem 3978: Unique Middle Element
// Platform: LeetCode
// Difficulty: Easy
//
// Note:
// The code provided solves a different problem:
// "Check if the Middle Element is Unique".
//
// Approach:
// We find the middle element of the array and
// check whether it appears exactly once.
//
// Steps:
// 1. If the array is empty, return true.
// 2. Find the middle index:
//      mid = n / 2
// 3. Store the middle element value.
// 4. Traverse the array and count how many
//    times the middle element appears.
// 5. Return true if its frequency is exactly 1,
//    otherwise return false.
//
// Example:
// Input: [1,2,3,4,5]
//
// Middle element = 3
// Frequency of 3 = 1
//
// Output: true
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public boolean isMiddleElementUnique(int[] nums) {

        int n = nums.length;

        if (n == 0) {

            return true;
        }

        int mid = n / 2;
        int midValue = nums[mid];

        int count = 0;

        // Count occurrences of middle element
        for (int i = 0; i < n; i++) {

            if (nums[i] == midValue) {

                count++;
            }
        }

        return count == 1;
    }
}
