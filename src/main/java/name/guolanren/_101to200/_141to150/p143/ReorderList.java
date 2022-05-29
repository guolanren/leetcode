package name.guolanren._101to200._141to150.p143;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/reorder-list/
 * @author guolanren
 */
public class ReorderList {

    public void reorderList(ListNode head) {
        LinkedList<ListNode> deque = new LinkedList<>();
        ListNode node = head;
        while (node != null) {
            deque.addLast(node);
            node = node.next;
        }

        ListNode current = new ListNode();
        while (!deque.isEmpty()) {
            ListNode n1 = deque.poll();
            ListNode n2 = deque.pollLast();
            current.next = n1;
            n1.next = n2;
            current = n2;
        }
        if (current != null) {
            current.next = null;
        }
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
