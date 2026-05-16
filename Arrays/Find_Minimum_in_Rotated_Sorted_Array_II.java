// Problem 154: Find Minimum in Rotated Sorted Array II
// Platform: LeetCode
// Difficulty: Hard

// Approach:
// We use Binary Search to efficiently find the minimum
// element in a rotated sorted array that may contain duplicates.
//
// Key Observation:
// - One half of the array is always sorted.
// - The minimum element lies in the unsorted half.
// - Duplicates make it harder to determine the sorted half,
//   so we reduce the search space carefully.
//
// Steps:
// 1. Initialize two pointers:
//      - low = 0
//      - high = n - 1
// 2. Find the middle element.
// 3. Compare nums[mid] with nums[high]:
//      - If nums[mid] > nums[high]:
//            Minimum lies in the right half.
//            Move low = mid + 1
//      - If nums[mid] < nums[high]:
//            Minimum lies in the left half including mid.
//            Move high = mid
//      - Else:
//            Duplicate elements found.
//            Reduce search space using high--
// 4. When low == high, it points to the minimum element.
//
// Time Complexity:
// - Average Case: O(log n)
// - Worst Case: O(n) due to duplicates
//
// Space Complexity: O(1)

class Solution {

    public int findMin(int[] nums) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Minimum lies in right half
            if (nums[mid] > nums[high]) {

                low = mid + 1;
            }

            // Minimum lies in left half including mid
            else if (nums[mid] < nums[high]) {

                high = mid;
            }

            // Duplicate elements
            else {

                high--;
            }
        }

        return nums[low];
    }
}
