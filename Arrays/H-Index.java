// Problem 274: H-Index
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We sort the citations array in ascending order.
//
// Key Observation:
// A researcher has an H-Index of h if:
// - At least h papers have h or more citations.
//
// After sorting:
// - citations[i] is the smallest citation count
//   among the remaining (n - i) papers.
// - If citations[i] >= (n - i),
//   then (n - i) can be a valid H-Index.
//
// Steps:
// 1. Sort the citations array.
// 2. Traverse the sorted array.
// 3. For each index i:
//      - Calculate papers = n - i.
//      - If citations[i] >= papers,
//        return papers.
// 4. If no valid H-Index is found,
//    return 0.
//
// Example:
// Input:
// citations = [3,0,6,1,5]
//
// After sorting:
// [0,1,3,5,6]
//
// i = 2:
// citations[2] = 3
// papers = 5 - 2 = 3
//
// 3 >= 3 → H-Index = 3
//
// Output:
// 3
//
// Time Complexity: O(n log n)
// Space Complexity: O(1)
// (excluding sorting space)

class Solution {

    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int n = citations.length;

        for (int i = 0; i < n; i++) {

            int papers = n - i;

            if (citations[i] >= papers) {

                return papers;
            }
        }

        return 0;
    }
}
