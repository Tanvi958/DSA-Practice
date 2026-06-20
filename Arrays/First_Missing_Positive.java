// Problem 41: First Missing Positive
// Platform: LeetCode
// Difficulty: Hard

// Approach:
// We use the array itself as a hash table
// to mark which positive numbers are present.
//
// Key Observation:
// - The first missing positive number must lie
//   in the range [1, n + 1], where n is the
//   length of the array.
// - Numbers outside this range can be ignored.
//
// Steps:
//
// 1. Clean the array:
//      - Replace all negative numbers, zeros,
//        and numbers greater than n with n + 1.
//      - These values are not useful for finding
//        the first missing positive.
//
// 2. Mark existing numbers:
//      - For each valid number num in [1, n]:
//          * Use index (num - 1).
//          * Make nums[num - 1] negative
//            to indicate that num exists.
//
// 3. Find the first missing positive:
//      - Traverse the array.
//      - The first positive value at index i
//        means number (i + 1) is missing.
//
// 4. If all positions are marked:
//      - Return n + 1.
//
// Example:
// Input: [3,4,-1,1]
//
// After cleaning:
// [3,4,5,1]
//
// After marking:
// [-3,4,-5,-1]
//
// First positive index = 1
//
// Output:
// 2
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int firstMissingPositive(int[] nums) {

        int n = nums.length;

        // Step 1: Clean the array
        for (int i = 0; i < n; i++) {

            if (nums[i] <= 0 || nums[i] > n) {

                nums[i] = n + 1;
            }
        }

        // Step 2: Mark existing numbers
        for (int i = 0; i < n; i++) {

            int num = Math.abs(nums[i]);

            if (num > n) {

                continue;
            }

            if (nums[num - 1] > 0) {

                nums[num - 1] = -nums[num - 1];
            }
        }

        // Step 3: Find first missing positive
        for (int i = 0; i < n; i++) {

            if (nums[i] > 0) {

                return i + 1;
            }
        }

        // All numbers from 1 to n are present
        return n + 1;
    }
}
