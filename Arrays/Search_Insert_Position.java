// Problem 35: Search Insert Position
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use Binary Search to efficiently find the target
// element in the sorted array.
//
// If the target exists:
// - Return its index.
//
// If the target does not exist:
// - Return the index where it should be inserted
//   to maintain sorted order.
//
// Steps:
// 1. Initialize two pointers:
//      - low = 0
//      - high = n - 1
// 2. Find the middle index.
// 3. Compare nums[mid] with target:
//      - If equal:
//            Return mid
//      - If nums[mid] < target:
//            Search in right half
//      - Else:
//            Search in left half
// 4. When the loop ends, low points to the correct
//    insertion position.
//
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public int searchInsert(int[] nums, int target) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            // Target found
            if (nums[mid] == target) {

                return mid;
            }

            // Search in right half
            else if (nums[mid] < target) {

                low = mid + 1;
            }

            // Search in left half
            else {

                high = mid - 1;
            }
        }

        // Correct insertion position
        return low;
    }
}
