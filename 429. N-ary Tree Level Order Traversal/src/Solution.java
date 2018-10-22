import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;

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
public class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> levelOder = new ArrayList<>();
        if (root == null) return levelOder;
//        Queue<Node> nodes = new LinkedList<>();
////        ((LinkedList<Node>) nodes).add(root);
////        singleChildlVisit(nodes, levelOder);
        visitNode(root, 0, levelOder);
        return levelOder;
    }

    private void visitNode(Node root, int nodeLevel, List<List<Integer>> result) {
        if (root == null) return;
        if (nodeLevel >= result.size())
            result.add(new ArrayList<>());
        result.get(nodeLevel).add(root.val);
        for (Node node : root.children) {
            visitNode(node, nodeLevel + 1, result);
        }
    }


    private void singleChildlVisit(Queue<Node> nodes, List<List<Integer>> childLevel) {
        while (! nodes.isEmpty()) {
            List<Integer> l = new ArrayList<>();
            childLevel.add(l);
            Queue<Node> childNodes = new LinkedList<>();
            while (!nodes.isEmpty()) {
                Node root = nodes.poll();
                if (root == null) return;
                l.add(root.val);
                addChildNodes(root, childNodes);
            }
            nodes = childNodes;
        }

    }

    private void addChildNodes(Node root, Queue<Node> nodes) {
        if (root != null) {
            for (Node n : root.children) {
                nodes.add(n);
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
