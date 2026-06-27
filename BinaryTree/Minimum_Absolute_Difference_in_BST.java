// Problem 530: Minimum Absolute Difference in BST
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We perform an Inorder Traversal of the BST.
//
// Key Observation:
// - Inorder traversal of a Binary Search Tree
//   produces values in sorted order.
// - Therefore, the minimum absolute difference
//   must occur between two consecutive nodes
//   in the inorder sequence.
//
// Steps:
// 1. Perform inorder traversal (Left → Root → Right).
// 2. Keep track of the previously visited node value.
// 3. For each current node:
//      - Compute the difference between
//        current value and previous value.
//      - Update the minimum difference.
// 4. Continue traversal for all nodes.
// 5. Return the minimum difference found.
//
// Example:
// Input:
//      4
//     / \
//    2   6
//   / \
//  1   3
//
// Inorder: [1, 2, 3, 4, 6]
//
// Differences:
// 2-1 = 1
// 3-2 = 1
// 4-3 = 1
// 6-4 = 2
//
// Output:
// 1
//
// Time Complexity: O(n)
// Space Complexity: O(h)
// h = height of the BST

class Solution {

    private Integer prev = null;
    private int minDiff = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {

        inorder(root);

        return minDiff;
    }

    private void inorder(TreeNode node) {

        if (node == null) {

            return;
        }

        inorder(node.left);

        // Compare with previous node
        if (prev != null) {

            minDiff = Math.min(minDiff, node.val - prev);
        }

        prev = node.val;

        inorder(node.right);
    }
}
