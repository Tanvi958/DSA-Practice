// Problem 2553: Separate the Digits in an Array
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We traverse each number in the array.
// For every number:
// 1. Extract its digits using modulo (%) and division (/).
// 2. Digits come in reverse order, so store them temporarily.
// 3. Reverse the temporary list and add digits to the final answer list.
// Finally, convert the ArrayList into an integer array.

// Time Complexity: O(total digits)
// Space Complexity: O(total digits)

import java.util.*;

class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for (int i : nums) {

            // Store digits of current number
            List<Integer> curr = new ArrayList<>();

            while (i > 0) {
                curr.add(i % 10);
                i = i / 10;
            }

            // Add digits in correct order
            Collections.reverse(curr);
            ans.addAll(curr);
        }

        // Convert List<Integer> to int[]
        return ans.stream().mapToInt(Integer::intValue).toArray();
    }
}
