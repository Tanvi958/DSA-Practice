// Problem 404: Sum of Left Leaves
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use Recursion (DFS) to traverse the binary tree
// and find the sum of all left leaf nodes.
//
// A left leaf is a node that:
// - Is the left child of its parent.
// - Has no left and right children.
//
// Steps:
// 1. If the tree is empty, return 0.
// 2. Initialize a variable sum = 0.
// 3. If the left child exists:
//      - Check whether it is a leaf node.
//      - If yes, add its value to sum.
//      - Otherwise, recursively process the left subtree.
// 4. Recursively process the right subtree.
// 5. Return the total sum.
//
// Example:
// Input:
//       3
//      / \
//     9  20
//       /  \
//      15   7
//
// Left leaves: 9, 15
// Output: 24
//
// Time Complexity: O(n)
// Space Complexity: O(h)
// h = height of the tree (recursive stack space)

class Solution {

    public int sumOfLeftLeaves(TreeNode root) {

        if (root == null) {

            return 0;
        }

        int sum = 0;

        if (root.left != null) {

            // Check if left child is a leaf
            if (root.left.left == null && root.left.right == null) {

                sum += root.left.val;

            } else {

                sum += sumOfLeftLeaves(root.left);
            }
        }

        // Process right subtree
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }
}
