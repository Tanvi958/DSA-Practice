// Problem 162: Find Peak Element
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use Binary Search to find a peak element.
//
// Key Observation:
// - A peak element is greater than its neighbors.
// - If nums[mid] < nums[mid + 1],
//   we are on an increasing slope,
//   so a peak must exist on the right side.
// - Otherwise, a peak exists at mid or on the left side.
//
// Steps:
// 1. Initialize:
//      low = 0
//      high = n - 1
// 2. While low < high:
//      - Find mid.
//      - If nums[mid] < nums[mid + 1]:
//            Move to the right half.
//      - Else:
//            Move to the left half including mid.
// 3. When low == high,
//    it points to a peak element.
// 4. Return low.
//
// Example:
// Input:
// nums = [1,2,3,1]
//
// mid = 1
// nums[1] < nums[2]
//
// Search right side.
//
// Peak found at index 2.
//
// Output:
// 2
//
// Time Complexity: O(log n)
// Space Complexity: O(1)



class Solution {
    public int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start < end){
         int mid = start + (end-start)/2;
         if(arr[mid]<=arr[mid+1]){
            start= mid+1;
         }
         else{
            end = mid;
         }
        }
        return start;
    }
}