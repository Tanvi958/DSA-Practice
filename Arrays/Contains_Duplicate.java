// Problem 217: Contains Duplicate
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use a HashSet to keep track of the
// elements we have already seen.
//
// Key Observation:
// - A HashSet stores only unique elements.
// - If an element is already present in the set,
//   then a duplicate exists.
//
// Steps:
// 1. Create an empty HashSet.
// 2. Traverse the array.
// 3. For each element:
//      - If it already exists in the set,
//        return true.
//      - Otherwise, add it to the set.
// 4. If the traversal completes without finding
//    any duplicate, return false.
//
// Example:
// Input:
// nums = [1,2,3,1]
//
// Process:
// Add 1
// Add 2
// Add 3
// 1 already exists -> duplicate found
//
// Output:
// true
//
// Example:
// Input:
// nums = [1,2,3,4]
//
// No duplicate elements.
//
// Output:
// false
//
// Time Complexity: O(n)
// Space Complexity: O(n)

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {

                return true;
            }

            else {

                set.add(nums[i]);
            }
        }

        return false;
    }
}
