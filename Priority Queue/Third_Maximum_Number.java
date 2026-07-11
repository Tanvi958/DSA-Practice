// Problem 414: Third Maximum Number
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use a Min Heap of size 3 and a HashSet
// to keep track of distinct numbers.
//
// Key Observation:
// - We need the third distinct maximum number.
// - Duplicate values should be ignored.
// - A Min Heap of size 3 efficiently stores
//   the three largest distinct elements.
//
// Steps:
// 1. Create:
//      - A HashSet to avoid duplicates.
//      - A Min Heap to store at most 3 distinct numbers.
// 2. Traverse the array:
//      - If the number has not been seen:
//          * Add it to the HashSet.
//          * Add it to the Min Heap.
//      - If heap size exceeds 3:
//          * Remove the smallest element.
//          * Remove it from the HashSet.
// 3. After traversal:
//      - If fewer than 3 distinct numbers exist,
//        return the maximum number.
//      - Otherwise, return the third maximum
//        (the top of the Min Heap).
//
// Example:
// Input: [3,2,1]
//
// Distinct elements:
// [3,2,1]
//
// Third maximum = 1
//
// Output:
// 1
//
// Example:
// Input: [1,2]
//
// Less than 3 distinct numbers,
// return maximum = 2.
//
// Output:
// 2
//
// Time Complexity: O(n log 3) ≈ O(n)
// Space Complexity: O(1)

class Solution {

    public int thirdMax(int[] nums) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        HashSet<Integer> visited = new HashSet<>();

        for (int num : nums) {

            if (!visited.contains(num)) {

                visited.add(num);

                minHeap.offer(num);

                if (minHeap.size() > 3) {

                    int removed = minHeap.poll();

                    visited.remove(removed);
                }
            }
        }

        // If fewer than 3 distinct numbers exist,
        // return the maximum element
        if (minHeap.size() < 3) {

            while (minHeap.size() > 1) {

                minHeap.poll();
            }
        }

        return minHeap.peek();
    }
}
