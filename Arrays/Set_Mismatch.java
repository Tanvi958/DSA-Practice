// Problem 645: Set Mismatch
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use a frequency array to count occurrences of each number.
//
// Since the array should contain numbers from 1 to n:
// - The number with frequency 2 is the duplicated number.
// - The number with frequency 0 is the missing number.
//
// Steps:
// 1. Create a frequency array of size n + 1.
// 2. Count occurrences of each element.
// 3. Traverse from 1 to n:
//      - freq[i] == 2 → duplicate number
//      - freq[i] == 0 → missing number
// 4. Return both numbers as an array.
//
// Time Complexity: O(n)
// Space Complexity: O(n)

package Arrays;

public class Set_Mismatch {

    public int[] findErrorNums(int[] nums) {

        int n = nums.length;

        int[] freq = new int[n + 1];

        // Count frequency of each number
        for (int num : nums) {
            freq[num]++;
        }

        int duplicate = -1;
        int missing = -1;

        // Find duplicate and missing number
        for (int i = 1; i <= n; i++) {

            if (freq[i] == 2) {
                duplicate = i;
            }

            if (freq[i] == 0) {
                missing = i;
            }
        }

        return new int[]{duplicate, missing};
    }
}
