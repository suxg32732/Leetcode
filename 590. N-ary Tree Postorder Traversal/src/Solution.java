import java.util.ArrayList;
import java.util.List;

/*
前序遍历 先访问根节点 再访问左子树 再访问右子树
后序遍历 先访问左子树 再访问右子树 再访问根节点
中序遍历 先访问根节点 再访问左子树 在访问右子树


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
    public List<Integer> postorder(Node root) {
        List<Integer> postOrder = new ArrayList<>();
        visitNode(root, postOrder);
        return postOrder;
    }

    private void visitNode(Node root, List<Integer> post) {
        if (root == null) return;
        if (! root.children.isEmpty()) {
            for (Node node : root.children) {
                visitNode(node, post);
            }
        }
        post.add(root.val);
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
};
