package name.guolanren._1to100._21to30.p23;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/merge-k-sorted-lists/
 * @author guolanren
 */
public class MergeKSortedLists {

    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        ListNode cur = null;
        List<ListNode> listNodeList = new ArrayList();
        for (ListNode listNode : lists) {
            if (listNode != null) {
                listNodeList.add(listNode);
            }
        }
        while (!listNodeList.isEmpty()) {
            int minIndex = -1;
            for (int i = 0; i < listNodeList.size(); i++) {
                if (minIndex == -1 ||
                        listNodeList.get(i).val < listNodeList.get(minIndex).val) {
                    minIndex = i;
                }
            }
            ListNode minNode = listNodeList.get(minIndex);
            if (minNode.next == null) {
                listNodeList.remove(minIndex);
            } else {
                listNodeList.set(minIndex, minNode.next);
            }
            if (head == null) {
                head = minNode;
                cur = head;
            } else {
                cur.next = minNode;
                cur = cur.next;
            }
            cur.next = null;
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
