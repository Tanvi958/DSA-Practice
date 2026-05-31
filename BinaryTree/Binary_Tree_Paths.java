// Problem 257: Binary Tree Paths
// Platform: LeetCode
// Difficulty: Easy

// Approach:
// We use Depth First Search (DFS) to explore
// all root-to-leaf paths in the binary tree.
//
// Steps:
// 1. Create a result list to store all paths.
// 2. Start DFS traversal from the root node.
// 3. For each node:
//      - Add its value to the current path.
// 4. If the node is a leaf node
//    (both left and right are null):
//      - Add the complete path to the result list.
// 5. Otherwise:
//      - Append "->" to the path.
//      - Recursively traverse left and right subtrees.
// 6. Return the result list containing all paths.
//
// Example:
// Input:
//       1
//      / \
//     2   3
//      \
//       5
//
// Output:
// ["1->2->5", "1->3"]
//
// Time Complexity: O(n)
// Space Complexity: O(h)
// h = height of the tree (recursive stack space)

class Solution {

    public List<String> binaryTreePaths(TreeNode root) {

        List<String> result = new ArrayList<>();

        if (root == null) {

            return result;
        }

        dfs(root, "", result);

        return result;
    }

    private void dfs(TreeNode node, String path, List<String> result) {

        if (node == null) {

            return;
        }

        // Add current node value to path
        path += node.val;

        // Leaf node reached
        if (node.left == null && node.right == null) {

            result.add(path);

            return;
        }

        // Continue path
        path += "->";

        dfs(node.left, path, result);
        dfs(node.right, path, result);
    }
}
