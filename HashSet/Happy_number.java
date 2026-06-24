// Problem 202: Happy Number
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We repeatedly replace the number with the
// sum of the squares of its digits.
//
// A number is happy if this process eventually
// reaches 1.
//
// Key Observation:
// - If the process does not reach 1,
//   it will enter a cycle.
// - We use a HashSet to detect previously
//   seen numbers and avoid infinite loops.
//
// Steps:
// 1. Create a HashSet to store visited numbers.
// 2. While:
//      - n is not 1, and
//      - n has not been seen before
//    continue processing.
// 3. Add the current number to the set.
// 4. Replace n with the sum of the squares
//    of its digits.
// 5. If n becomes 1, return true.
// 6. If a cycle is detected, return false.
//
// Example:
// Input: 19
//
// 19 -> 82
// 82 -> 68
// 68 -> 100
// 100 -> 1
//
// Output: true
//
// Time Complexity: O(log n)
// Space Complexity: O(log n)

import java.util.HashSet;
import java.util.Set;

class Solution {

    public boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();

        // Continue until 1 or a cycle is found
        while (n != 1 && !seen.contains(n)) {

            seen.add(n);

            n = getNext(n);
        }

        return n == 1;
    }

    private int getNext(int n) {

        int sum = 0;

        // Calculate sum of squares of digits
        while (n > 0) {

            int digit = n % 10;

            sum += digit * digit;

            n /= 10;
        }

        return sum;
    }
}
