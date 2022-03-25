package name.guolanren._1to100._81to90.p82;

/**
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii/
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedList2 {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode sentinel = new ListNode();
        ListNode write = sentinel;
        ListNode read = head;
        int preVal = -101;

        while (read != null) {
            ListNode next = read.next;
            if (read.val != preVal &&
                    (next == null || read.val != next.val)) {
                write.next = read;
                write = write.next;
                write.next = null;
            }
            preVal = read.val;
            read = next;
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

