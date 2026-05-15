// Problem 1441: Build an Array With Stack Operations
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We simulate the process of building the target array
// using "Push" and "Pop" operations.
//
// Rules:
// 1. Read numbers from 1 to n sequentially.
// 2. For every number:
//      - Perform "Push" operation.
// 3. If the current number is not needed in target:
//      - Perform "Pop" operation.
// 4. If the number matches the current target element:
//      - Keep it and move to the next target index.
// 5. Stop once all target elements are processed.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (excluding output list space)

import java.util.*;

class Solution {

    public List<String> buildArray(int[] target, int n) {

        List<String> output = new ArrayList<>();

        int targetIndex = 0;

        // Traverse numbers from 1 to n
        for (int i = 1; i <= n; i++) {

            // Push current number
            output.add("Push");

            // If current number matches target element
            if (i == target[targetIndex]) {

                targetIndex++;

                // Stop when target array is completely built
                if (targetIndex == target.length) {
                    break;
                }

            } else {

                // Remove unnecessary number
                output.add("Pop");
            }
        }

        return output;
    }
}
