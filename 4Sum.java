// Problem 18: 4Sum
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We first sort the array so we can use the
// two-pointer technique efficiently.
//
// Steps:
// 1. Fix the first element using loop i
// 2. Fix the second element using loop j
// 3. Use two pointers:
//    - low  -> starting after j
//    - high -> end of array
//
// For every combination:
// - if sum == target
//      add quadruplet to HashSet
//      move both pointers
//
// - if sum < target
//      move low forward to increase sum
//
// - if sum > target
//      move high backward to decrease sum
//
// HashSet is used to automatically remove
// duplicate quadruplets.
//
// Finally, convert the set into a list
// and return the result.

// Time Complexity: O(n^3)
// Space Complexity: O(k)
// k = number of unique quadruplets

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        
        int n = nums.length;

        Arrays.sort(nums);

        Set<List<Integer>> s = new HashSet<>();

        for (int i = 0; i < n - 3; i++) {

            for (int j = i + 1; j < n - 2; j++) {

                int low = j + 1;
                int high = n - 1;

                while (low < high) {

                    long sum = (long) nums[i]
                             + nums[low]
                             + nums[j]
                             + nums[high];

                    if (sum == target) {

                        s.add(Arrays.asList(
                                nums[i],
                                nums[low],
                                nums[j],
                                nums[high]
                        ));

                        low++;
                        high--;
                    }

                    else if (sum < target) {
                        low++;
                    }

                    else {
                        high--;
                    }
                }
            }
        }

        return new ArrayList<>(s);
    }
}
