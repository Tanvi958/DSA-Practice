// Problem 1365: How Many Numbers Are Smaller Than the Current Number
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use Counting Sort technique because the constraints
// limit the numbers to the range 0 to 100.
//
// Steps:
// 1. Create a count array of size 101 to store
//    the frequency of each number.
// 2. Count occurrences of every number in nums.
// 3. Convert the count array into a prefix sum array:
//      - count[i] stores how many numbers are smaller than i.
// 4. Traverse nums again:
//      - For each nums[i], use count[nums[i]]
//        to get the number of smaller elements.
// 5. Store the answer in the result array.
//
// Time Complexity: O(n)
// Space Complexity: O(1)
// (Count array size is constant: 101)

class Solution {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        int[] count = new int[101];

        int[] result = new int[nums.length];

        // Count frequency of each number
        for (int num : nums) {
            count[num]++;
        }

        // Build prefix sum array
        int runningSum = 0;

        for (int i = 0; i < count.length; i++) {

            int temp = count[i];

            count[i] = runningSum;

            runningSum += temp;
        }

        // Find count of smaller numbers
        for (int i = 0; i < nums.length; i++) {

            result[i] = count[nums[i]];
        }

        return result;
    }
}
