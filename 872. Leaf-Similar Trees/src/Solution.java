import java.util.ArrayList;
import java.util.List;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
*/
class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> seq1 = new ArrayList<>();
        List<Integer> seq2 = new ArrayList<>();
        getTreeSequen(root1, seq1);
        getTreeSequen(root2, seq2);
        if (seq1.size() == seq1.size()) {
            for (int i = 0; i < seq1.size(); i++) {
                if (seq1.get(i) != seq2.get(i))
                    return false;
            }
            return true;
        }
        else
            return false;
    }

    private void getTreeSequen(TreeNode root, List<Integer> seq) {
        if (root == null) return;
        else if (root.left == null && root.right == null) {
            seq.add(root.val);
        }
        else {
            getTreeSequen(root.left, seq);
            getTreeSequen(root.right, seq);
        }
    }
}

 class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
 }
