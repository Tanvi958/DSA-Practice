// Problem 2078: Two Furthest Houses With Different Colors
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We aim to find the maximum distance between two houses with different colors.
// Instead of checking all pairs (which is O(n^2)), we optimize using observations.
//
// Step 1: Compare all houses with the first house.
// Traverse from the end and find the farthest house with a different color.
// This gives one possible maximum distance.
//
// Step 2: Compare all houses with the last house.
// Traverse from the beginning and find the farthest house with a different color.
// This gives another possible maximum distance.
//
// The answer is the maximum of these two distances.
// This works because the maximum distance must involve either the first
// or the last house for optimality.

// Time Complexity: O(n)
// Space Complexity: O(1)


package Arrays;

public class Two_Furthest_Houses {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        int maxDist = 0;

        // Compare with first house
        for (int j = n - 1; j >= 0; j--) {
            if (colors[j] != colors[0]) {
                maxDist = Math.max(maxDist, j);
                break; // farthest found
            }
        }

        // Compare with last house
        for (int i = 0; i < n; i++) {
            if (colors[i] != colors[n - 1]) {
                maxDist = Math.max(maxDist, (n - 1 - i));
                break; // farthest found
            }
        }

        return maxDist;
    }
}

