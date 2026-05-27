// Problem 3121: Count the Number of Special Characters II
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We track:
// - The first occurrence of uppercase letters.
// - The last occurrence of lowercase letters.
//
// A character is considered special if:
// 1. It appears in both lowercase and uppercase.
// 2. Every lowercase occurrence appears before
//    the first uppercase occurrence.
//
// Steps:
// 1. Store the first occurrence of each character.
// 2. Store the last occurrence of each character.
// 3. Traverse all letters from 'a' to 'z':
//      - If lowercase exists
//      - And uppercase exists
//      - And last lowercase index < first uppercase index
//        then increment answer.
// 4. Return the total count of special characters.
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int numberOfSpecialChars(String word) {

        int[] first = new int['z' + 1];
        int[] last = new int['z' + 1];

        // Store first and last occurrence
        for (int i = 1; i <= word.length(); i++) {

            int ch = word.charAt(i - 1);

            if (first[ch] == 0) {

                first[ch] = i;
            }

            last[ch] = i;
        }

        int ans = 0;

        // Check special characters
        for (int i = 0; i < 26; i++) {

            int lower = 'a' + i;
            int upper = 'A' + i;

            if (last[lower] > 0 &&
                first[upper] > 0 &&
                last[lower] < first[upper]) {

                ans++;
            }
        }

        return ans;
    }
}
