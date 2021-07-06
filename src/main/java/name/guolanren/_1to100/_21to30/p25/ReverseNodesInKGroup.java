package name.guolanren._1to100._21to30.p25;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/reverse-nodes-in-k-group/
 * @author guolanren
 */
public class ReverseNodesInKGroup {

    public ListNode reverseKGroup(ListNode head, int k) {
        LinkedList<ListNode> buffer = new LinkedList<>();
        ListNode cursorForResult = head;
        ListNode cursorForOriginal = head;
        head = null;
        while (cursorForOriginal != null) {
            ListNode next = cursorForOriginal.next;
            cursorForOriginal.next = null;
            if (buffer.size() == k- 1) {
                if (head == null) {
                    head = cursorForOriginal;
                    cursorForResult = head;
                } else {
                    cursorForResult.next = cursorForOriginal;
                    cursorForResult = cursorForResult.next;
                }
                while (!buffer.isEmpty()) {
                    cursorForResult.next = buffer.pop();
                    cursorForResult = cursorForResult.next;
                }
            } else {
                buffer.push(cursorForOriginal);
            }
            cursorForOriginal = next;
        }
        while (!buffer.isEmpty()) {
            cursorForResult.next = buffer.pollLast();
            cursorForResult = cursorForResult.next;
        }
        return head;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

    @Override
    public String toString() {
        return next == null ? Integer.toString(val) : val + "," + next;
    }
}
