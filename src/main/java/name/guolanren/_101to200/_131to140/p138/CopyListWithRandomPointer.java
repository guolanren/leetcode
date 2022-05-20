package name.guolanren._101to200._131to140.p138;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/copy-list-with-random-pointer/
 * @author guolanren
 */
public class CopyListWithRandomPointer {

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Node> map = new HashMap<>();

        Node copyHead = new Node(head.val);
        map.put(head, copyHead);

        Node n = head;
        while (n.next != null) {
            n = n.next;
            map.put(n, new Node(n.val));
        }

        n = head;
        while (n != null) {
            Node copy = map.get(n);
            copy.next = map.get(n.next);
            copy.random = map.get(n.random);
            n = n.next;
        }

        return copyHead;
    }

}

class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
