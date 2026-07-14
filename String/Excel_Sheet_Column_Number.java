// Problem 171: Excel Sheet Column Number
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We treat the column title as a number in
// base-26, where:
//
// A -> 1
// B -> 2
// ...
// Z -> 26
//
// Similar to converting a number from any base
// to decimal.
//
// Formula:
// ans = ans * 26 + currentCharacterValue
//
// Steps:
// 1. Initialize ans = 0.
// 2. Traverse each character in the column title.
// 3. Convert the character to its corresponding value:
//      value = ch - 'A' + 1
// 4. Update:
//      ans = ans * 26 + value
// 5. Return the final result.
//
// Example:
// Input: "AB"
//
// Calculation:
// A = 1
// ans = 0 * 26 + 1 = 1
//
// B = 2
// ans = 1 * 26 + 2 = 28
//
// Output:
// 28
//
// Example:
// Input: "ZY"
//
// Calculation:
// Z = 26
// Y = 25
//
// ans = 26 * 26 + 25 = 701
//
// Output:
// 701
//
// Time Complexity: O(n)
// n = length of columnTitle
//
// Space Complexity: O(1)

class Solution {

    public int titleToNumber(String columnTitle) {

        long ans = 0;

        for (int i = 0; i < columnTitle.length(); i++) {

            char ch = columnTitle.charAt(i);

            ans = ans * 26 + (ch - 'A' + 1);
        }

        return (int) ans;
    }
}
