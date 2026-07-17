// Problem 75: Sort Colors
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use the Dutch National Flag Algorithm
// to sort the array in a single traversal.
//
// Key Observation:
// - The array contains only 0s, 1s, and 2s.
// - Maintain three pointers:
//      low  -> next position for 0
//      mid  -> current element being processed
//      high -> next position for 2
//
// Regions:
// [0 ... low-1]      -> 0s
// [low ... mid-1]    -> 1s
// [mid ... high]     -> unprocessed
// [high+1 ... n-1]   -> 2s
//
// Steps:
// 1. Initialize:
//      low = 0
//      mid = 0
//      high = n - 1
// 2. While mid <= high:
//      - If nums[mid] == 0:
//          Swap nums[low] and nums[mid]
//          Increment low and mid
//
//      - If nums[mid] == 1:
//          Increment mid
//
//      - If nums[mid] == 2:
//          Swap nums[mid] and nums[high]
//          Decrement high
//          (Do not increment mid because the
//           swapped element must be checked.)
// 3. Array becomes sorted in-place.
//
// Example:
// Input:
// [2,0,2,1,1,0]
//
// Output:
// [0,0,1,1,2,2]
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public void sortColors(int[] nums) {

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {

            if (nums[mid] == 0) {

                int temp = nums[low];
                nums[low++] = nums[mid];
                nums[mid++] = temp;
            }

            else if (nums[mid] == 1) {

                mid++;
            }

            else {

                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high--] = temp;
            }
        }
    }
}
