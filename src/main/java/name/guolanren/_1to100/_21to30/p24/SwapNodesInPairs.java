package name.guolanren._1to100._21to30.p24;

/**
 * @link https://leetcode.com/problems/swap-nodes-in-pairs/
 * @author guolanren
 */
public class SwapNodesInPairs {

    public ListNode swapPairs(ListNode head) {
        ListNode firstInPair = head;
        ListNode secondInPair;
        ListNode secondInLastPair = null;
        while (firstInPair != null) {
            secondInPair = firstInPair.next;
            if (secondInPair != null) {
                firstInPair.next = secondInPair.next;
                secondInPair.next = firstInPair;
                if (firstInPair == head) {
                    head = secondInPair;
                }
                if (secondInLastPair != null) {
                    secondInLastPair.next = secondInPair;
                }
                secondInLastPair = firstInPair;
                firstInPair = firstInPair.next;
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
