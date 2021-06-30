package name.guolanren._1to100._21to30.p21;

/**
 * @link https://leetcode.com/problems/merge-two-sorted-lists/
 * @author guolanren
 */
public class MergeTwoSortedLists {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = l1;
        ListNode last = null;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                if (l1.val >= l2.val) {
                    ListNode cur2 = l2;
                    l2 = l2.next;
                    cur2.next = l1;
                    if (last != null) {
                        last.next = cur2;
                    } else {
                        head = cur2;
                    }
                    last = cur2;
                } else {
                    last = l1;
                    l1 = l1.next;
                }
            } else if (l1 == null) {
                if (head == null) {
                    head = l2;
                }
                if (last != null) {
                    last.next = l2;
                }
                break;
            } else {
                break;
            }
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
