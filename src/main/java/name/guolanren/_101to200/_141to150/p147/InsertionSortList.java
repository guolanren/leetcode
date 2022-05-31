package name.guolanren._101to200._141to150.p147;

/**
 * @link https://leetcode.com/problems/insertion-sort-list/
 * @author guolanren
 */
public class InsertionSortList {

    public ListNode insertionSortList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode subSortList = insertionSortList(head.next);
        if (subSortList == null) {
            return head;
        }
        ListNode preNode = null;
        ListNode node = subSortList;
        while (node != null) {
            if (node.val >= head.val) {
                head.next = node;
                if (preNode != null) {
                    preNode.next = head;
                    return subSortList;
                } else {
                    return head;
                }
            }
            preNode = node;
            node = node.next;
        }
        preNode.next = head;
        head.next = null;
        return subSortList;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
