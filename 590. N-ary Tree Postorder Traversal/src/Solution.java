import java.util.ArrayList;
import java.util.Collections;
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
    public List<Integer> postorder(Node root) {
        if (root == null) return null;
        List<Integer> post = new ArrayList<>();
        post.add(root.val);


        Collections.reverse(post);
        return post;
    }

    private void getChildPostOrder(Node node, List<Integer> ) {
        if (node)

        List<Integer> l = new ArrayList<>();
        if (node != null) {
            for (int i = node.children.size() - 1; i >= 0 ; i--) {
                l.add(node.children.get(i).val);
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
};
