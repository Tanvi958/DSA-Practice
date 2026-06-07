// Problem 228: Summary Ranges
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We traverse the sorted array and group
// consecutive numbers into ranges.
//
// Steps:
// 1. Create a list to store the result.
// 2. For each number, mark it as the start
//    of a potential range.
// 3. Continue moving forward while the next
//    number is exactly 1 greater than the current.
// 4. After the sequence ends:
//      - If start == end, add the single number.
//      - Otherwise, add the range in the format
//        "start->end".
// 5. Repeat until all elements are processed.
//
// Example:
// Input: [0,1,2,4,5,7]
//
// Output:
// ["0->2","4->5","7"]
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (excluding the output list)

class Solution {

    public List<String> summaryRanges(int[] nums) {

        List<String> list = new ArrayList<>();

        // Special case: single element
        if (nums.length == 1) {

            list.add(nums[0] + "");

            return list;
        }

        for (int i = 0; i < nums.length; i++) {

            int start = nums[i];

            // Find end of consecutive range
            while (i + 1 < nums.length &&
                   (nums[i + 1] - nums[i]) == 1) {

                i++;
            }

            // Add range or single element
            if (start != nums[i]) {

                list.add(start + "->" + nums[i]);

            } else {

                list.add(start + "");
            }
        }

        return list;
    }
}
