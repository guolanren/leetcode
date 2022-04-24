package name.guolanren._101to200._111to120.p117;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @link https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii/
 * @author guolanren
 */
public class PopulatingNextRightPointersInEachNode2 {

    public Node connect(Node root) {
        if (root == null) {
            return null;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        connect(queue);
        return root;
    }

    private void connect(Queue<Node> queue) {
        while (!queue.isEmpty()) {
            int size = queue.size();
            Node previous = null;
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if (previous != null) {
                    previous.next = node;
                }
                previous = node;

                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
        }
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
};
