// Problem 1047: Remove All Adjacent Duplicates In String
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use a Stack to remove adjacent duplicate characters.
//
// Key Observation:
// - If the current character matches the top of the stack,
//   both characters form an adjacent duplicate pair and
//   should be removed.
// - Otherwise, push the character onto the stack.
//
// Steps:
// 1. Create an empty stack.
// 2. Traverse each character in the string.
// 3. For each character:
//      - If the stack is not empty and the top element
//        equals the current character:
//            Remove the top element from the stack.
//      - Otherwise:
//            Push the current character onto the stack.
// 4. After processing all characters, the stack contains
//    the final string without adjacent duplicates.
// 5. Build the result string from the stack and return it.
//
// Example:
// Input: "abbaca"
//
// Process:
// a → [a]
// b → [a,b]
// b → [a]      (duplicate removed)
// a → []       (duplicate removed)
// c → [c]
// a → [c,a]
//
// Output: "ca"
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public String removeDuplicates(String s) {

        Stack<Character> stack = new Stack<>();

        // Process each character
        for (char ch : s.toCharArray()) {

            if (!stack.isEmpty() && stack.peek() == ch) {

                stack.pop();

            } else {

                stack.push(ch);
            }
        }

        // Build final string
        StringBuilder result = new StringBuilder();

        for (char ch : stack) {

            result.append(ch);
        }

        return result.toString();
    }
}
