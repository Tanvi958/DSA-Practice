// Problem 1189: Maximum Number of Balloons
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We count the frequency of each character
// in the given string and determine how many
// times the word "balloon" can be formed.
//
// Key Observation:
// The word "balloon" requires:
//      b -> 1 time
//      a -> 1 time
//      l -> 2 times
//      o -> 2 times
//      n -> 1 time
//
// Therefore:
// - The number of possible "balloon" words
//   depends on the limiting character.
// - For 'l' and 'o', divide their frequencies by 2.
//
// Steps:
// 1. Create a frequency array of size 26.
// 2. Count occurrences of each character.
// 3. Compute:
//      b count
//      a count
//      l count / 2
//      o count / 2
//      n count
// 4. Return the minimum among these values.
//
// Example:
// Input: "loonbalxballpoon"
//
// Frequencies:
// b = 2
// a = 2
// l = 4
// o = 4
// n = 2
//
// Output:
// 2
//
// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {

    public int maxNumberOfBalloons(String text) {

        int[] freq = new int[26];

        // Count frequency of each character
        for (char ch : text.toCharArray()) {

            freq[ch - 'a']++;
        }

        // Find the limiting character count
        return Math.min(
                Math.min(freq['b' - 'a'], freq['a' - 'a']),
                Math.min(
                    Math.min(freq['l' - 'a'] / 2,
                             freq['o' - 'a'] / 2),
                    freq['n' - 'a']
                )
        );
    }
}
