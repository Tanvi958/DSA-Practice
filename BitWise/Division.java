// Problem 29: Divide Two Integers
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We perform division without using multiplication, division, or mod operators.
// First, handle the overflow case when dividend = Integer.MIN_VALUE and divisor = -1.
// Determine the sign of the result using XOR of signs.
// Convert both numbers to positive using long to avoid overflow.
// Then, repeatedly subtract the largest multiple of divisor from dividend.
// We optimize subtraction by doubling the divisor using bit shifting (temp << 1).
// Each time we subtract, we add the corresponding multiple to the quotient.
// Finally, apply the sign to the result and return the quotient.

// Time Complexity: O(log n)
// Space Complexity: O(1)

package BitWise;

public class Division {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }

        int sign = ((dividend < 0) ^ (divisor < 0)) ? -1 : 1;

        long dvd = Math.abs((long) dividend);
        long dvs = Math.abs((long) divisor);

        int quotient = 0;

        while (dvd >= dvs) {
            long temp = dvs;
            int multiple = 1;

            while (dvd >= (temp << 1)) {
                temp <<= 1;
                multiple <<= 1;
            }

            dvd -= temp;
            quotient += multiple;
        }

        return sign == 1 ? quotient : -quotient;
    }
}
