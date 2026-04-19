// Problem 84: Largest Rectangle in Histogram
// Platform: LeetCode
// Difficulty: Hard

// Approach:
// We use a Monotonic Increasing Stack to efficiently calculate the largest rectangle.
// The stack stores indices of bars in increasing height order.
// We iterate through all bars, and for each bar, we maintain the increasing order.
// If the current bar is smaller than the top of the stack,
// we pop from the stack and calculate the area with the popped height as the smallest bar.
// The width is determined using the current index and the new top of the stack.
// To handle remaining bars, we iterate one extra step with height = 0.
// This ensures all bars are processed and maximum area is found.

// Time Complexity: O(n)
// Space Complexity: O(n)

package Stack;

import java.util.Stack;

public class Largest_Rectangle_in_Histogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int n = heights.length;

        for (int i = 0; i <= n; i++) {
            int height = (i == n) ? 0 : heights[i];

            while (!stack.isEmpty() && height < heights[stack.peek()]) {
                int h = heights[stack.pop()];
                int width;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                maxArea = Math.max(maxArea, h * width);
            }

            stack.push(i);
        }

        return maxArea;
    }
}

