// Problem 3936: Minimum Swaps to Move Zeros to End
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use the Two Pointer technique to count the minimum
// swaps required to move all 0s to the end of the array.
//
// Key Observation:
// - A 0 on the left side is misplaced.
// - A non-zero element on the right side can be swapped
//   with that 0.
// - Each such swap helps move zeros toward the end.
//
// Steps:
// 1. Initialize two pointers:
//      - low at the beginning
//      - high at the end
// 2. Traverse while low < high:
//      - If nums[high] == 0:
//            Move high backward because 0 is already
//            at the correct position.
//      - If nums[low] == 0 and nums[high] != 0:
//            Swap both elements.
//            Increment swap count.
//            Move both pointers.
//      - Otherwise:
//            Move low forward.
// 3. Return the total number of swaps performed.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int minimumSwaps(int[] nums) {

        int n = nums.length;

        int low = 0;
        int high = n - 1;

        int min_move = 0;

        while (low < high) {

            // 0 already at correct position
            if (nums[high] == 0) {

                high--;
            }

            // Swap misplaced 0 with non-zero element
            else if (nums[low] == 0 && nums[high] != 0) {

                int temp = nums[high];
                nums[high] = nums[low];
                nums[low] = temp;

                min_move++;

                low++;
                high--;
            }

            // Move low pointer
            else {

                low++;
            }
        }

        return min_move;
    }
}
