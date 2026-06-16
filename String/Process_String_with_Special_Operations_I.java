// Problem 3612: Process String with Special Operations I
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We simulate the operations on the string
// using a StringBuilder to efficiently modify
// the result as we process each character.
//
// Special Operations:
// '*' → Remove the last character (if present)
// '#' → Duplicate the current result string
// '%' → Reverse the current result string
// 'a' - 'z' → Append the character to the result
//
// Steps:
// 1. Create an empty StringBuilder.
// 2. Traverse the input string from left to right.
// 3. For each character:
//      - If it is a lowercase letter,
//        append it to the result.
//      - If it is '*',
//        remove the last character if it exists.
//      - If it is '#',
//        duplicate the current result.
//      - If it is '%',
//        reverse the current result.
// 4. Return the final processed string.
//
// Example:
// Input: s = "a#b%*"
//
// Process:
// "a"
// "aa"      (#)
// "aab"     (b)
// "baa"     (%)
// "ba"      (*)
//
// Output: "ba"
//
// Time Complexity: O(2^n) in the worst case
// (because '#' can repeatedly double the string)
//
// Space Complexity: O(2^n)

class Solution {

    public String processStr(String s) {

        StringBuilder result = new StringBuilder();

        if (s == null || s.length() == 0) {

            return result.toString();
        }

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Remove last character
            if (ch == '*') {

                if (result.length() > 0) {

                    result.deleteCharAt(result.length() - 1);
                }
            }

            // Duplicate current string
            else if (ch == '#') {

                result.append(result.toString());
            }

            // Reverse current string
            else if (ch == '%') {

                result.reverse();
            }

            // Append lowercase letters
            else if (ch >= 'a' && ch <= 'z') {

                result.append(ch);
            }
        }

        return result.toString();
    }
}
