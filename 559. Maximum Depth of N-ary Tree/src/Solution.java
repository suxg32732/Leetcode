import java.util.ArrayList;
import java.util.List;

/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/
class Solution {
    public int maxDepth(Node root) {
        int max = 0;
//        List<Integer> depth = new ArrayList<>();
//        getNodeDepth(root, 1, depth);
//        for (Integer i :depth) {
//            max = i > max ? i: max;
//        }
//        return max;
        if (root == null) return 0;
        else if (root.children == null || root.children.isEmpty())
            return 1;
        for (Node node : root.children) {
            max = Math.max(max, 1 + maxDepth(node));
        }
        return max;
    }

    private void getNodeDepth(Node root, int level, List<Integer> depth) {
        if (root == null) return;
        if (root.children == null || root.children.isEmpty())
            depth.add(level);
        else {
            for (Node node : root.children) {
                getNodeDepth(node, level+1, depth);
            }
        }
    }
}

class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val,List<Node> _children) {
        val = _val;
        children = _children;
    }
}