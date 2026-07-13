// Problem 1331: Rank Transform of an Array
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We assign ranks to the elements based on
// their sorted order.
//
// Ranking Rules:
// - The smallest unique element gets rank 1.
// - Equal elements receive the same rank.
// - Larger elements receive larger ranks.
//
// Steps:
// 1. Create a copy of the original array.
// 2. Sort the copied array.
// 3. Traverse the sorted array and assign
//    ranks to unique elements using a HashMap.
// 4. Traverse the original array:
//      - Replace each element with its rank
//        from the HashMap.
// 5. Return the transformed array.
//
// Example:
// Input:
// arr = [40,10,20,30]
//
// Sorted:
// [10,20,30,40]
//
// Rank Map:
// 10 -> 1
// 20 -> 2
// 30 -> 3
// 40 -> 4
//
// Output:
// [4,1,2,3]
//
// Time Complexity: O(n log n)
// (sorting dominates)
//
// Space Complexity: O(n)

class Solution {

    public int[] arrayRankTransform(int[] arr) {

        // Create a copy and sort it
        int[] sorted = arr.clone();

        Arrays.sort(sorted);

        // Store ranks of unique elements
        Map<Integer, Integer> rank = new HashMap<>();

        int r = 1;

        for (int num : sorted) {

            if (!rank.containsKey(num)) {

                rank.put(num, r++);
            }
        }

        // Build result array
        int[] result = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            result[i] = rank.get(arr[i]);
        }

        return result;
    }
}
