package name.guolanren._101to200._111to120.p116;

/**
 * @link https://leetcode.com/problems/populating-next-right-pointers-in-each-node/
 * @author guolanren
 */
public class PopulatingNextRightPointersInEachNode {

    public Node connect(Node root) {
        if (root == null) {
            return root;
        }
        Node rightOfLeft = root.left;
        Node leftOfRight = root.right;
        connect(rightOfLeft);
        connect(leftOfRight);
        while (rightOfLeft != null) {
            rightOfLeft.next = leftOfRight;
            rightOfLeft = rightOfLeft.right;
            leftOfRight = leftOfRight.left;
        }
        return root;
    }

}

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
}
