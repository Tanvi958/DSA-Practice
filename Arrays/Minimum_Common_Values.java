// Problem 2540: Minimum Common Value
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use the Two Pointer technique because
// both arrays are already sorted.
//
// Steps:
// 1. Initialize two pointers:
//      - low for nums1
//      - high for nums2
// 2. Compare elements at both pointers:
//      - If equal:
//            Return the common element.
//      - If nums1[low] < nums2[high]:
//            Move low forward.
//      - Else:
//            Move high forward.
// 3. Continue until one array is completely traversed.
// 4. If no common element exists, return -1.
//
// Since arrays are sorted, the first common element
// found will be the minimum common value.
//
// Time Complexity: O(n + m)
// Space Complexity: O(1)

class Solution {

    public int getCommon(int[] nums1, int[] nums2) {

        int low = 0;
        int high = 0;

        // Traverse both arrays
        while (low < nums1.length && high < nums2.length) {

            // Common element found
            if (nums1[low] == nums2[high]) {

                return nums1[low];
            }

            // Move pointer in nums1
            else if (nums1[low] < nums2[high]) {

                low++;
            }

            // Move pointer in nums2
            else {

                high++;
            }
        }

        // No common element found
        return -1;
    }
}
