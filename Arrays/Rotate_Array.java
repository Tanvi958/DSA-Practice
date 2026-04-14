// Problem 189: Rotate Array
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use the reversal algorithm to rotate the array efficiently.
// First, we reverse the entire array.
// Then, we reverse the first k elements.
// Finally, we reverse the remaining (n - k) elements.
// This results in the array being rotated to the right by k steps.

// Time Complexity: O(n)
// Space Complexity: O(1)

package Arrays;

public class Rotate_Array {
       public void rotate(int[] nums, int k) {
        int n = nums.length;
        
        k = k % n;
        
        reverse(nums, 0, n - 1);
        
        reverse(nums, 0, k - 1);
        
        reverse(nums, k, n - 1);
    }

         private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            
            start++;
            end--;
        }
    }
    }


