package name.guolanren._1to100._81to90.p86;

/**
 * @link https://leetcode.com/problems/partition-list/
 * @author guolanren
 */
public class PartitionList {

    public ListNode partition(ListNode head, int x) {
        ListNode lessHead = new ListNode();
        ListNode lessTail = lessHead;
        ListNode geHead = new ListNode();
        ListNode geTail = geHead;

        ListNode read = head;
        while (read != null) {
            ListNode next = read.next;
            if (read.val < x) {
                lessTail.next = read;
                lessTail = lessTail.next;
            } else {
                geTail.next = read;
                geTail = geTail.next;
                geTail.next = null;
            }
            read = next;
        }

        lessTail.next = geHead.next;
        return lessHead.next;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
