// Problem 167: Two Sum II - Input Array Is Sorted
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// This solution uses a Brute Force approach.
//
// We check every possible pair of elements
// in the sorted array and return the indices
// whose sum equals the target.
//
// Note:
// Since the problem guarantees exactly one solution,
// we return immediately when the pair is found.
//
// Steps:
// 1. Traverse the array using index i.
// 2. For each i, check all elements after it
//    using index j.
// 3. If numbers[i] + numbers[j] equals target:
//      - Return {i + 1, j + 1}
//      - (Indices are 1-based as required.)
// 4. If no pair is found, return {-1, -1}.
//
// Example:
// Input:
// numbers = [2,7,11,15]
// target = 9
//
// Check:
// 2 + 7 = 9
//
// Output:
// [1,2]
//
// Time Complexity: O(n²)
// Space Complexity: O(1)

class Solution {

    public int[] twoSum(int[] numbers, int target) {

        int n = numbers.length;

        for (int i = 0; i < n - 1; i++) {

            for (int j = i + 1; j < n; j++) {

                if ((numbers[i] + numbers[j]) == target) {

                    return new int[] {i + 1, j + 1};
                }
            }
        }

        return new int[] {-1, -1};
    }
}
