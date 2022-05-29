package name.guolanren._101to200._141to150.p141;

/**
 * @link https://leetcode.com/problems/linked-list-cycle/
 * @author guolanren
 */
public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        ListNode n1 = head;
        ListNode n2 = head;
        while (n2 != null) {
            n1 = n1.next;
            n2 = n2.next;
            if (n2 == null) {
                return false;
            }
            n2 = n2.next;
            if (n1 == n2) {
                return true;
            }
        }
        return false;
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