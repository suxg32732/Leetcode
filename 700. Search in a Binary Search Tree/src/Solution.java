/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
         return root == null ?
             null : root.val > val ?
             searchBST(root.left, val) : root.val == val ?
             root : searchBST(root.right, val);
    }
}

 class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}