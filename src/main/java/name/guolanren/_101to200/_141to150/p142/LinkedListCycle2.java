package name.guolanren._101to200._141to150.p142;

/**
 * @link https://leetcode.com/problems/linked-list-cycle-ii/
 * @author guolanren
 */
public class LinkedListCycle2 {

    public ListNode detectCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
            if (n2 == null) {
                return null;
            }
            n2 = n2.next;
            if (n1 == n2) {
                n1 = head;
                while (n1 != n2) {
                    n1 = n1.next;
                    n2 = n2.next;
                }
                return n1;
            }
        }
        return null;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
