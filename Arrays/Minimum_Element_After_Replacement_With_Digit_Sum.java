// Problem 3300: Minimum Element After Replacement With Digit Sum
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We calculate the sum of digits for every number
// in the array and keep track of the minimum sum.
//
// Steps:
// 1. Initialize ans with Integer.MAX_VALUE.
// 2. Traverse each number in the array.
// 3. Find the sum of digits of the current number:
//      - Extract last digit using % 10
//      - Add it to sum
//      - Remove last digit using / 10
// 4. Update ans with the minimum digit sum found.
// 5. Return ans.
//
// Time Complexity: O(n * d)
// d = number of digits in each number
//
// Space Complexity: O(1)

int ans = Integer.MAX_VALUE;

// Traverse all numbers
for (int num : nums) {

    int sum = 0;

    // Calculate digit sum
    while (num > 0) {

        sum += num % 10;

        num /= 10;
    }

    // Update minimum digit sum
    ans = Math.min(ans, sum);
}

return ans;
