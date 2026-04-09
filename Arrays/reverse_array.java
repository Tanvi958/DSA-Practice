// Problem: Arrays - DS
// Platform: HackerRank
// Difficulty: Easy

// Optimized Approach:
// Reverse the array in-place using two pointers
// Swap elements from start and end

// Time Complexity: O(n)
// Space Complexity: O(1)

package Arrays;

import java.util.*;

public class reverse_array {
    public static List<Integer> reverseArray(List<Integer> a) {
        int left = 0;
        int right = a.size() - 1;

        while(left < right) {
            // swap
            int temp = a.get(left);
            a.set(left, a.get(right));
            a.set(right, temp);

            left++;
            right--;
        }

        return a;
    }
}