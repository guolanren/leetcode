package name.guolanren._101to200._141to150.p148;

/**
 * @link https://leetcode.com/problems/sort-list/
 * @author guolanren
 */
public class SortList {

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node1 = head;
        ListNode node2 = head.next.next;
        while (node2 != null) {
            node1 = node1.next;
            node2 = node2.next;
            if (node2 != null) {
                node2 = node2.next;
            }
        }
        ListNode l2 = node1.next;
        node1.next = null;
        return mergeSort(head, l2);
    }

    private ListNode mergeSort(ListNode l1, ListNode l2) {
        ListNode sortedL1 = sortList(l1);
        ListNode sortedL2 = sortList(l2);

        ListNode node1 = sortedL1;
        ListNode node2 = sortedL2;
        ListNode sentinel = new ListNode();
        ListNode node = sentinel;
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                node.next = node2;
                break;
            } else if (node2 == null) {
                node.next = node1;
                break;
            } else if (node1.val <= node2.val) {
                node.next = node1;
                node1 = node1.next;
                node = node.next;
                node.next = null;
            } else {
                node.next = node2;
                node2 = node2.next;
                node = node.next;
                node.next = null;
            }
        }
        return sentinel.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
