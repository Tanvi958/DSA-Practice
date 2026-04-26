// Problem 2124: Check if All 'a's Appear Before All 'b's
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// The goal is to ensure that no 'b' appears before an 'a' in the string.
//
// We find the last occurrence of 'a' and the first occurrence of 'b'.
// If the last 'a' comes before the first 'b', the condition is satisfied.
//
// If there is no 'b' in the string, it is also valid.
//
// So, we return true if:
// - last index of 'a' < first index of 'b', OR
// - 'b' does not exist in the string.

// Time Complexity: O(n)
// Space Complexity: O(1)


package String;

public class Appearance_Of_A {
    public boolean checkString(String s) {
        int a = s.lastIndexOf('a');
        int b = s.indexOf('b');
        return a<b||b==-1;
        
    }
}
