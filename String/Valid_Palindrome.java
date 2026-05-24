// Problem 125: Valid Palindrome
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We first clean the string by:
// - Converting all characters to lowercase.
// - Removing all non-alphanumeric characters.
//
// Then, we use the Two Pointer technique
// to check whether the cleaned string is a palindrome.
//
// Steps:
// 1. Convert the string to lowercase.
// 2. Remove all characters except letters and digits.
// 3. Initialize two pointers:
//      - left at the beginning
//      - right at the end
// 4. Compare characters at both pointers:
//      - If they are different, return false.
//      - Otherwise, move both pointers inward.
// 5. If all characters match, return true.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public boolean isPalindrome(String s) {

        // Convert to lowercase and remove non-alphanumeric characters
        String cleanStr = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = cleanStr.length() - 1;

        // Check palindrome using two pointers
        while (left < right) {

            if (cleanStr.charAt(left) != cleanStr.charAt(right)) {

                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}
