package name.guolanren._1to100._91to100.p92;

/**
 * @link https://leetcode.com/problems/reverse-linked-list-ii/
 * @author guolanren
 */
public class ReverseLinkedList2 {

    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode leftHead = null;
        ListNode leftTail = leftHead;
        ListNode read = head;
        for (int i = 1; i < left; i++) {
            if (leftHead == null) {
                leftHead = read;
            }
            leftTail = read;
            read = read.next;
        }

        ListNode rightHead = read;
        ListNode middleHead = null;
        ListNode middleTail = middleHead;
        for (int i = left; i <= right; i++) {
            if (middleTail == null) {
                middleTail = read;
            }
            rightHead = read.next;
            read.next = middleHead;
            middleHead = read;
            read = rightHead;
        }

        middleTail.next = rightHead;
        if (leftHead != null) {
            leftTail.next = middleHead;
            return leftHead;
        } else {
            return middleHead;
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
