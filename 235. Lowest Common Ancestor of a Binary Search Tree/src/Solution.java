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

    public static void main(String[] args) {
        Object
        String a = "a";
        String b = "a";
        System.out.println(a==b);
    }

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p == null || q == null)
            return null;
        else if (root.val > p.val && root.val > q.val) // 同在左侧
            return lowestCommonAncestor(root.left, p, q);
        else if (root.val < p.val && root.val < q.val) // 同在右侧
            return lowestCommonAncestor(root.right, p, q);
        else
            return root; // 分别在左右
    }

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {

        if (root == null || p == null || q == null)
            return null;

        List<TreeNode> path2p = new ArrayList<>();
        List<TreeNode> path2q = new ArrayList<>();

        getPath2Node(root, p.val, path2p);
        getPath2Node(root, q.val, path2q);

        for (int i = path2p.size() - 1; i > -1 ; i--) {
            TreeNode node = path2p.get(i);
            if (path2q.contains(node))
                return node;
        }
        return null;
    }

    private void getPath2Node(TreeNode root, int target, List<TreeNode> path) {
        if (root == null)
            return;

        path.add(root);

        if (root.val == target)
            return;
        else
            getPath2Node(root.val > target ? root.left : root.right, target, path);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}