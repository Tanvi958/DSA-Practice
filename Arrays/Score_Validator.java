// Problem 3921: Score Validator
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We simulate the scoring system ball by ball.
//
// Rules:
// 1. "W" → wicket
//    - counts as a legal delivery
//    - no runs added
//
// 2. "WD" or "NB"
//    - adds 1 extra run
//    - does NOT count as a legal delivery
//
// 3. Numeric value ("1", "4", "6", etc.)
//    - adds runs to score
//    - counts as a legal delivery
//
// We continue processing until:
// - all events are processed OR
// - 10 legal deliveries are completed.
//
// Finally, return:
// [totalScore, Counter]

// Time Complexity: O(n)
// Space Complexity: O(1)

class Solution {
    public int[] scoreValidator(String[] events) {

        int score = 0;
        int counter = 0;

        for (int i = 0; i < events.length && counter < 10; i++) {

            if (events[i].equals("W")) {
                counter++;

            } else if (events[i].equals("WD") || events[i].equals("NB")) {
                score += 1;

            } else {
                score += Integer.parseInt(events[i]);
                counter++;
            }
        }

        return new int[]{score, counter};
    }
}
