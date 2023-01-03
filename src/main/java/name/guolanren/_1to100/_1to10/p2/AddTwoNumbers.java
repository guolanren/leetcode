package name.guolanren._1to100._1to10.p2;

/**
 * @link https://leetcode.com/problems/add-two-numbers/
 * @author guolanren
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l3 = new ListNode();
        ListNode tail = l3;
        int nodeVal = 0;
        while (l1 != null || l2 != null || nodeVal != 0) {
            if (l1 != null) {
                nodeVal += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                nodeVal += l2.val;
                l2 = l2.next;
            }

            tail.next = new ListNode(nodeVal % 10);
            tail = tail.next;
            nodeVal = nodeVal / 10;
        }
        return l3.next;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
