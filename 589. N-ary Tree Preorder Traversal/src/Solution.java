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
public class Solution {
    public List<Integer> preorder(Node root) {
        List<Integer> preOrder = new ArrayList<>();
        preVisit(root, preOrder);
        return preOrder;
    }

    private void preVisit(Node root, List<Integer> order) {
        if (root == null) return;
        order.add(root.val);
        if (! root.children.isEmpty()) {
            for (Node node : root.children) {
                preVisit(node, order);
            }
        }
    }
}

class Node {

    public int val;

    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
