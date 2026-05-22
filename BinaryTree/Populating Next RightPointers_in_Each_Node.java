// Problem 116: Populating Next Right Pointers in Each Node
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We use Recursion to connect nodes at the same level
// in a perfect binary tree.
//
// Key Observation:
// - Every node has both left and right children.
// - The left child's next pointer should point to
//   the right child.
// - The right child's next pointer should point to
//   the left child of the node's next neighbor.
//
// Steps:
// 1. If the tree is empty, return null.
// 2. Connect:
//      - root.left.next = root.right
// 3. If root has a next node:
//      - root.right.next = root.next.left
// 4. Recursively process left and right subtrees.
// 5. Return the root node.
//
// Time Complexity: O(n)
// Space Complexity: O(h)
// h = height of the tree (recursive stack space)

class Solution {

    public Node connect(Node root) {

        // Empty tree
        if (root == null) {

            return null;
        }

        build_tree(root);

        return root;
    }

    public void build_tree(Node root) {

        // Base condition
        if (root == null || root.left == null || root.right == null) {

            return;
        }

        // Connect left child to right child
        root.left.next = root.right;

        // Connect right child to next subtree
        if (root.next != null) {

            root.right.next = root.next.left;
        }

        // Recursively connect subtrees
        build_tree(root.left);
        build_tree(root.right);
    }
}
