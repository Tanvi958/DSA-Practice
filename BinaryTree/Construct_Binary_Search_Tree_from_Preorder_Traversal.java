// Problem 1008: Construct Binary Search Tree from Preorder Traversal
// Platform: LeetCode
// Difficulty: Medium

// Approach:
// We construct the BST directly from the preorder
// traversal using recursion and value bounds.
//
// Key Observation:
// - In preorder traversal, the first element is
//   always the root.
// - All values smaller than the root belong to
//   the left subtree.
// - All values greater than the root belong to
//   the right subtree.
// - By maintaining an upper bound, we can decide
//   whether a value belongs to the current subtree.
//
// Steps:
// 1. Maintain a global index to track the current
//    element in the preorder array.
// 2. Create a recursive function with an upper bound.
// 3. If the current value exceeds the bound,
//    it does not belong to the current subtree.
// 4. Create a node using the current value.
// 5. Recursively build:
//      - Left subtree with bound = node.val
//      - Right subtree with the current bound
// 6. Return the constructed root.
//
// Example:
// Input:
// preorder = [8,5,1,7,10,12]
//
// BST:
//        8
//       / \
//      5   10
//     / \    \
//    1   7    12
//
// Output:
// Root of the constructed BST
//
// Time Complexity: O(n)
// Space Complexity: O(h)
// h = height of the BST

class Solution {

    private int index = 0;

    public TreeNode bstFromPreorder(int[] preorder) {

        return build(preorder, Integer.MAX_VALUE);
    }

    private TreeNode build(int[] preorder, int bound) {

        if (index == preorder.length ||
            preorder[index] > bound) {

            return null;
        }

        TreeNode root = new TreeNode(preorder[index++]);

        root.left = build(preorder, root.val);

        root.right = build(preorder, bound);

        return root;
    }
}
