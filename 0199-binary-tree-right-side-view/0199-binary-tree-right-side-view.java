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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> list=new ArrayList<>();
        rightview(root,list,0);
        return list;
    }

    private void rightview(TreeNode curr,List<Integer> list,int currDepth)
    {
        if(curr==null)
        {
            return;
        }

        if(currDepth==list.size())
        {
            list.add(curr.val);
        }

        rightview(curr.right,list,currDepth+1);
        rightview(curr.left,list,currDepth+1);

    }
}