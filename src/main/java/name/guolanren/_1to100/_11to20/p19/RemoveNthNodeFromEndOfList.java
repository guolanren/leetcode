package name.guolanren._1to100._11to20.p19;

/**
 * @link https://leetcode.com/problems/remove-nth-node-from-end-of-list/
 * @author guolanren
 */
public class RemoveNthNodeFromEndOfList {

    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode cur = head;
        ListNode last = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = last;
            last = cur;
            cur = next;
        }

        cur = last;
        last = null;
        int counter = 0;
        while (cur != null) {
            ListNode next = cur.next;
            if (++counter != n) {
                cur.next = last;
                last = cur;
            }
            cur = next;
        }
        return last;
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
