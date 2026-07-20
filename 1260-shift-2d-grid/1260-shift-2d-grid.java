// Problem 1260: Shift 2D Grid
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We treat the 2D grid as a single linear array.
//
// Key Observation:
// - A grid with m rows and n columns contains
//   m * n elements.
// - Shifting the grid once is equivalent to moving
//   each element to the next position in this
//   linear representation.
// - Instead of performing k shifts one by one,
//   we can directly compute the final position
//   using modulo arithmetic.
//
// Steps:
// 1. Let total = m * n.
// 2. For each cell (i, j):
//      - Convert it to a linear index:
//            index = i * n + j
//      - Compute its new position:
//            newIndex = (index + k) % total
//      - Convert back to 2D coordinates:
//            newRow = newIndex / n
//            newCol = newIndex % n
// 3. Place the element in its new position.
// 4. Return the shifted grid.
//
// Example:
// Input:
// grid = [[1,2,3],
//         [4,5,6],
//         [7,8,9]]
// k = 1
//
// Output:
// [[9,1,2],
//  [3,4,5],
//  [6,7,8]]
//
// Time Complexity: O(m × n)
// Space Complexity: O(m × n)

class Solution {

    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int total = m * n;

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < m; i++) {

            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < n; j++) {

                row.add(0);
            }

            result.add(row);
        }

        for (int i = 0; i < m; i++) {

            for (int j = 0; j < n; j++) {

                int index = i * n + j;

                int newIndex = (index + k) % total;

                int newRow = newIndex / n;

                int newCol = newIndex % n;

                result.get(newRow).set(newCol, grid[i][j]);
            }
        }

        return result;
    }
}