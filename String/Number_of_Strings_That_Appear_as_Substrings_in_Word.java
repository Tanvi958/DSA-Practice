// Problem 1967: Number of Strings That Appear as Substrings in Word
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We check each string in the patterns array
// and count how many of them appear as a
// substring of the given word.
//
// Steps:
// 1. Initialize a counter to 0.
// 2. Traverse each pattern in the patterns array.
// 3. For each pattern:
//      - Use contains() to check whether it
//        exists in word.
//      - If it exists, increment the counter.
// 4. Return the final count.
//
// Example:
// Input:
// patterns = ["a","abc","bc","d"]
// word = "abc"
//
// Checks:
// "a"   -> present
// "abc" -> present
// "bc"  -> present
// "d"   -> not present
//
// Output:
// 3
//
// Time Complexity: O(n * m)
// n = number of patterns
// m = length of word (contains operation)
//
// Space Complexity: O(1)

class Solution {

    public int numOfStrings(String[] patterns, String word) {

        int n = patterns.length;

        int count = 0;

        // Check each pattern
        for (int i = 0; i < n; i++) {

            if (word.contains(patterns[i])) {

                count++;
            }
        }

        return count;
    }
}
