// Problem 114: Flatten Binary Tree to Linked List
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use a reverse preorder traversal (Right → Left → Root).
// A global pointer `prev` is maintained to track the previously processed node.
// First, we recursively flatten the right subtree.
// Then, we flatten the left subtree.
// After that, we connect the current node’s right pointer to `prev`
// and set its left pointer to NULL.
// Finally, we move `prev` to the current node.
// This way, we build the flattened linked list from back to front.

// Time Complexity: O(n)
// Space Complexity: O(h)  // recursion stack (h = height of tree)


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode prev = null;

    public void flatten(TreeNode root) {
        if (root == null) return;

        flatten(root.right);
        flatten(root.left);

        root.right = prev;
        root.left = null;
        prev = root;
    }
}
