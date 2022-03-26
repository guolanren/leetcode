package name.guolanren._1to100._81to90.p83;

/**
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-list/
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedList {

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return head;
        }

        ListNode read = head.next;
        ListNode write = head;
        write.next = null;
        int delVal = head.val;

        while (read != null) {
            ListNode next = read.next;
            if (read.val != delVal) {
                write.next = read;
                write = write.next;
                write.next = null;
                delVal = read.val;
            }
            read = next;
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
