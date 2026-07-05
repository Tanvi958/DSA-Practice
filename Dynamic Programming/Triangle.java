// Problem 120: Triangle
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use Dynamic Programming to find the
// minimum path sum from the top to the bottom
// of the triangle.
//
// Key Observation:
// For any position (i, j), we can move only to:
//      (i + 1, j)
//      (i + 1, j + 1)
//
// Therefore:
// dp[i][j] = triangle[i][j] +
//             min(dp[i+1][j], dp[i+1][j+1])
//
// Bottom-up DP allows us to reuse results
// from the row below.
//
// Steps:
// 1. Copy the last row of the triangle into dp.
// 2. Traverse rows from bottom-1 to top.
// 3. For each element:
//      dp[j] = triangle[i][j] +
//              min(dp[j], dp[j+1])
// 4. After processing all rows,
//    dp[0] contains the minimum path sum.
// 5. Return dp[0].
//
// Example:
// Input:
// [
//      [2],
//     [3,4],
//    [6,5,7],
//   [4,1,8,3]
// ]
//
// Calculation:
// Bottom row: [4,1,8,3]
//
// Row [6,5,7]:
// [7,6,10]
//
// Row [3,4]:
// [9,10]
//
// Row [2]:
// [11]
//
// Output:
// 11
//
// Time Complexity: O(n²)
// Space Complexity: O(n)

class Solution {

    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        int[] dp = new int[n];

        // Initialize with last row
        for (int i = 0; i < n; i++) {

            dp[i] = triangle.get(n - 1).get(i);
        }

        // Bottom-up DP
        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                dp[j] = triangle.get(i).get(j)
                        + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
}
