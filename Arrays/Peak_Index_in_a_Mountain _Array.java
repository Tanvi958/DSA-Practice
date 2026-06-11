// Problem 852: Peak Index in a Mountain Array
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use Binary Search to find the peak element
// in the mountain array.
//
// Key Observation:
// - In a mountain array, elements first increase
//   and then decrease.
// - If arr[mid] < arr[mid + 1], we are on the
//   increasing slope, so the peak lies to the right.
// - Otherwise, we are on the decreasing slope or
//   at the peak, so the peak lies at mid or to the left.
//
// Steps:
// 1. Initialize two pointers:
//      - low = 0
//      - high = n - 1
// 2. Find the middle index.
// 3. Compare arr[mid] with arr[mid + 1]:
//      - If arr[mid] < arr[mid + 1]:
//            Move low to mid + 1.
//      - Otherwise:
//            Move high to mid.
// 4. Continue until low == high.
// 5. Return low (or high), which represents
//    the peak index.
//
// Example:
// Input: [0,2,5,3,1]
//
// mid comparisons:
// 5 > 3 → peak is at mid or left
//
// Output: 2
//
// Time Complexity: O(log n)
// Space Complexity: O(1)

class Solution {

    public int peakIndexInMountainArray(int[] arr) {

        int low = 0;
        int high = arr.length - 1;

        while (low < high) {

            int mid = low + (high - low) / 2;

            // Peak lies on the right side
            if (arr[mid] < arr[mid + 1]) {

                low = mid + 1;
            }

            // Peak lies at mid or on the left side
            else {

                high = mid;
            }
        }

        return low;
    }
}
