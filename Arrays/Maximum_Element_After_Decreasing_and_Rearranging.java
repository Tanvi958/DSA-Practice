// Problem 1846: Maximum Element After Decreasing and Rearranging
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We first sort the array and then adjust the elements
// so that:
//      arr[0] = 1
// and
//      |arr[i] - arr[i-1]| <= 1
//
// Key Observation:
// - To maximize the largest element, each element
//   should be at most one greater than its previous element.
// - After sorting, we can greedily reduce values
//   whenever necessary.
//
// Steps:
// 1. Sort the array in ascending order.
// 2. Set the first element to 1.
// 3. Traverse the remaining elements:
//      - Make arr[i] equal to the minimum of:
//            current value
//            previous value + 1
// 4. The last element will be the maximum possible
//    value after all operations.
// 5. Return the last element.
//
// Example:
// Input: [2,2,1,2,1]
//
// After sorting:
// [1,1,2,2,2]
//
// Adjusted:
// [1,1,2,2,2]
//
// Output:
// 2
//
// Example:
// Input: [100,1,1000]
//
// Sorted:
// [1,100,1000]
//
// Adjusted:
// [1,2,3]
//
// Output:
// 3
//
// Time Complexity: O(n log n)
// Space Complexity: O(1)
// (excluding sorting space)

class Solution {

    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {

        Arrays.sort(arr);

        // First element must be 1
        arr[0] = 1;

        // Adjust remaining elements
        for (int i = 1; i < arr.length; i++) {

            arr[i] = Math.min(arr[i], arr[i - 1] + 1);
        }

        return arr[arr.length - 1];
    }
}
