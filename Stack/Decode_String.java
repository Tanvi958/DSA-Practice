// Problem 394: Decode String
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use two stacks:
// 1. countStack  -> stores repetition counts.
// 2. stringStack -> stores previously built strings.
//
// Key Observation:
// - When we encounter a number, it represents
//   how many times the upcoming substring
//   inside brackets should be repeated.
// - '[' marks the start of a new encoded substring.
// - ']' marks the end of the current substring,
//   which must be repeated and appended to the
//   previous string.
//
// Steps:
// 1. Traverse the string character by character.
// 2. If the character is a digit:
//      - Build the current number.
// 3. If the character is '[':
//      - Push the current number onto countStack.
//      - Push the current string onto stringStack.
//      - Reset current number and string.
// 4. If the character is ']':
//      - Pop the repeat count.
//      - Pop the previous string.
//      - Append the current string repeat times.
//      - Update the current string.
// 5. If the character is a letter:
//      - Append it to the current string.
// 6. Return the final decoded string.
//
// Example:
// Input: "3[a2[c]]"
//
// Process:
// 2[c]  -> "cc"
// a2[c] -> "acc"
// 3[...] -> "accaccacc"
//
// Output:
// "accaccacc"
//
// Time Complexity: O(n * k)
// k = maximum decoded length
//
// Space Complexity: O(n)

class Solution {

    public String decodeString(String s) {

        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> stringStack = new Stack<>();

        StringBuilder currStr = new StringBuilder();
        int currNum = 0;

        for (char ch : s.toCharArray()) {

            // Build multi-digit number
            if (Character.isDigit(ch)) {

                currNum = currNum * 10 + (ch - '0');
            }

            // Start of encoded substring
            else if (ch == '[') {

                countStack.push(currNum);
                stringStack.push(currStr);

                currNum = 0;
                currStr = new StringBuilder();
            }

            // End of encoded substring
            else if (ch == ']') {

                int repeat = countStack.pop();
                StringBuilder prevStr = stringStack.pop();

                for (int i = 0; i < repeat; i++) {

                    prevStr.append(currStr);
                }

                currStr = prevStr;
            }

            // Normal character
            else {

                currStr.append(ch);
            }
        }

        return currStr.toString();
    }
}
