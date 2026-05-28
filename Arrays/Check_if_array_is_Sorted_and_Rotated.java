// Problem 1752: Check if Array Is Sorted and Rotated
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// A sorted and rotated array can have at most
// one position where the current element is
// greater than the next element.
//
// Example:
// [3,4,5,1,2]
//
// Here:
// 5 > 1 → only one drop exists,
// so the array is sorted and rotated.
//
// Steps:
// 1. Traverse the array.
// 2. Compare nums[i] with nums[(i + 1) % n]:
//      - % n helps compare the last element
//        with the first element.
// 3. Count how many times:
//      nums[i] > nums[i + 1]
// 4. If count becomes greater than 1:
//      - Array is not sorted and rotated.
// 5. Otherwise, return true.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public boolean check(int[] nums) {

        int count = 0;

        int n = nums.length;

        // Count number of drops
        for (int i = 0; i < n; i++) {

            if (nums[i] > nums[(i + 1) % n]) {

                count++;
            }

            // More than one drop found
            if (count > 1) {

                return false;
            }
        }

        return true;
    }
}
