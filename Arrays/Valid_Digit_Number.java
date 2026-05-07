// Problem 3908 : Valid Digit Number
// Platform: LeetCode

// Approach:
// Convert the number into a character array.
// Convert digit x into character format.
// If the first digit is equal to x, return false.
// Otherwise, check the remaining digits.
// If x is found after the first position, return true.
// Else return false.

// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {
    public boolean validDigit(int n, int x) {

        char[] charArray = String.valueOf(n).toCharArray();
        char digit = (char) (x + '0');

        // First digit should not be x
        if (charArray[0] == digit) {
            return false;
        }

        // Check remaining digits
        for (int i = 1; i < charArray.length; i++) {
            if (charArray[i] == digit) {
                return true;
            }
        }

        return false;
    }
}
