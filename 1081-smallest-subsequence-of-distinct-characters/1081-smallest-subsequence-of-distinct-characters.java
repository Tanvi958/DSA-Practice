// Problem 1081: Smallest Subsequence of Distinct Characters
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use a Monotonic Stack along with:
// 1. last[]    -> stores the last occurrence
//                 index of each character.
// 2. visited[] -> tracks whether a character
//                 is already present in the stack.
//
// Key Observation:
// - Each character must appear exactly once.
// - We want the lexicographically smallest result.
// - If the current character is smaller than the
//   stack top and the stack top appears again later,
//   we can safely remove the stack top.
//
// Steps:
// 1. Store the last occurrence of every character.
// 2. Traverse the string.
// 3. If the current character is already in the stack,
//    skip it.
// 4. Otherwise:
//      - While:
//          * stack is not empty
//          * stack top > current character
//          * stack top appears again later
//        remove the stack top.
// 5. Push the current character into the stack
//    and mark it as visited.
// 6. Build the answer from the stack.
// 7. Return the resulting string.
//
// Example:
// Input:
// s = "bcabc"
//
// Process:
// b -> [b]
// c -> [b,c]
// a -> remove c, remove b, push a
// b -> [a,b]
// c -> [a,b,c]
//
// Output:
// "abc"
//
// Example:
// Input:
// s = "cbacdcbc"
//
// Output:
// "acdb"
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (26 lowercase letters)

class Solution {

    public String smallestSubsequence(String s) {

        int[] last = new int[26];

        // Store last occurrence of each character
        for (int i = 0; i < s.length(); i++) {

            last[s.charAt(i) - 'a'] = i;
        }

        Stack<Character> stack = new Stack<>();

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // Skip if already included
            if (visited[ch - 'a']) {

                continue;
            }

            // Maintain lexicographically smallest order
            while (!stack.isEmpty()
                    && stack.peek() > ch
                    && last[stack.peek() - 'a'] > i) {

                visited[stack.pop() - 'a'] = false;
            }

            stack.push(ch);

            visited[ch - 'a'] = true;
        }

        StringBuilder ans = new StringBuilder();

        for (char c : stack) {

            ans.append(c);
        }

        return ans.toString();
    }
}