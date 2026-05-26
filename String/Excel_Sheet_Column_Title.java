// Problem 168: Excel Sheet Column Title
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We convert the given column number into
// its corresponding Excel column title.
//
// Excel columns follow a base-26 system:
// A -> 1
// B -> 2
// ...
// Z -> 26
// AA -> 27
//
// Key Observation:
// - Unlike normal base conversion, Excel columns
//   are 1-based instead of 0-based.
// - Therefore, we decrement columnNumber before
//   taking modulo operation.
//
// Steps:
// 1. Create a StringBuilder to store characters.
// 2. While columnNumber > 0:
//      - Decrease columnNumber by 1.
//      - Find remainder using % 26.
//      - Convert remainder into corresponding character.
//      - Append character to result.
//      - Divide columnNumber by 26.
// 3. Reverse the string because characters are
//    generated from right to left.
// 4. Return the final result.
//
// Time Complexity: O(log26 n)
// Space Complexity: O(log26 n)

class Solution {

    public String convertToTitle(int columnNumber) {

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            // Adjust for 1-based indexing
            columnNumber--;

            // Find remainder
            int rem = columnNumber % 26;

            // Convert to corresponding character
            char ch = (char) ('A' + rem);

            result.append(ch);

            // Move to next position
            columnNumber = columnNumber / 26;
        }

        // Reverse the result
        return result.reverse().toString();
    }
}
