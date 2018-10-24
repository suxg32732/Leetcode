import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

    public List<Double> averageOfLevels1(TreeNode root) {
        Queue<TreeNode> nodes = new LinkedList<>();

    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<List<Integer>> levels = new ArrayList<>();
        bfs(root, 0, levels);
        List<Double> aver = new ArrayList<>();
        for (List<Integer> l : levels) {
            aver.add(getAverage(l));
        }
        return aver;
    }

    private void bfs(TreeNode root, int level, List<List<Integer>> levelVal) {
        if (root == null) return;
        if (level == levelVal.size())
            levelVal.add(new ArrayList<>());
        levelVal.get(level).add(root.val);
        bfs(root.left, level + 1, levelVal);
        bfs(root.right, level + 1, levelVal);
    }

    private double getAverage(List<Integer> l) {
        if (l == null || l.isEmpty())
            return 0;
        double res = 0;
        for (Integer i : l) {
            res += i;
        }
        return res / l.size();
    }
}

class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}