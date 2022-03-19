package name.guolanren._1to100._61to70.p61;

/**
 * @link https://leetcode.com/problems/rotate-list/
 * @author guolanren
 */
public class RotateList {

    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        ListNode tail = head;
        int total = 1;
        while (tail.next != null) {
            tail = tail.next;
            total++;
        }

        k = k % total;
        while (total - k > 0) {
            tail.next = head;
            tail = head;
            head = tail.next;
            tail.next = null;
            k++;
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
}
