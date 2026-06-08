// Problem 2161: Partition Array According to Given Pivot
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We divide the array into three groups:
//
// 1. Elements smaller than pivot.
// 2. Elements equal to pivot.
// 3. Elements greater than pivot.
//
// By storing these groups separately and then
// combining them in order, we obtain the required
// partitioned array while preserving the relative
// order of elements within each group.
//
// Steps:
// 1. Create three lists:
//      - less
//      - equal
//      - greater
// 2. Traverse the array:
//      - Add elements < pivot to less.
//      - Add elements == pivot to equal.
//      - Add elements > pivot to greater.
// 3. Create the answer array.
// 4. Copy all elements from:
//      less → equal → greater
//    into the answer array.
// 5. Return the final array.
//
// Example:
// Input:
// nums = [9,12,5,10,14,3,10], pivot = 10
//
// less    = [5,3]
// equal   = [10,10]
// greater = [9,12,14]
//
// Output:
// [5,3,10,10,9,12,14]
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public int[] pivotArray(int[] nums, int pivot) {

        List<Integer> less = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> greater = new ArrayList<>();

        // Divide elements into three groups
        for (int num : nums) {

            if (num < pivot) {

                less.add(num);

            } else if (num == pivot) {

                equal.add(num);

            } else {

                greater.add(num);
            }
        }

        int[] ans = new int[nums.length];

        int idx = 0;

        // Add smaller elements
        for (int num : less) {

            ans[idx++] = num;
        }

        // Add pivot elements
        for (int num : equal) {

            ans[idx++] = num;
        }

        // Add greater elements
        for (int num : greater) {

            ans[idx++] = num;
        }

        return ans;
    }
}
