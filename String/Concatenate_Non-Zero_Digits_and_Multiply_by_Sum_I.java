// Problem 3754: Concatenate Non-Zero Digits and Multiply by Sum I
// Platform: LeetCode
//
// Approach:
// We extract each digit of the number and:
// 1. Calculate the sum of all digits.
// 2. Form a new number by removing all zeros.
// 3. Return the product of the new number
//    and the digit sum.
//
// Steps:
// 1. Convert the integer to a string.
// 2. Traverse each character:
//      - Convert it into a digit.
//      - Add the digit to the running sum.
//      - If the digit is non-zero,
//        append it to the new number.
// 3. Multiply the constructed number by
//    the digit sum.
// 4. Return the result.
//
// Example:
// Input: n = 1023
//
// Digits:
// 1, 0, 2, 3
//
// Sum of digits = 1 + 0 + 2 + 3 = 6
// Number after removing zeros = 123
//
// Output:
// 123 × 6 = 738
//
// Time Complexity: O(d)
// d = number of digits in n
//
// Space Complexity: O(1)

class Solution {

    public long sumAndMultiply(int n) {

        long x = 0;
        long sum = 0;

        String s = String.valueOf(n);

        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);

            int d = c - '0';

            // Add digit to sum
            sum += d;

            // Build number without zeros
            if (d > 0) {

                x = x * 10 + d;
            }
        }

        return x * sum;
    }
}
