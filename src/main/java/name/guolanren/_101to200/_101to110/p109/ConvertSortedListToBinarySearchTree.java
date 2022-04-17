package name.guolanren._101to200._101to110.p109;

/**
 * @link https://leetcode.com/problems/convert-sorted-list-to-binary-search-tree/
 * @author guolanren
 */
public class ConvertSortedListToBinarySearchTree {

    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode previousOfMiddle = null;
        ListNode middle = head;
        ListNode tail = head;
        while (tail != null && tail.next != null) {
            previousOfMiddle = middle;
            middle = middle.next;
            tail = tail.next.next;
        }

        if (previousOfMiddle != null) {
            previousOfMiddle.next = null;
        }

        TreeNode parent = new TreeNode(middle.val);
        parent.left = sortedListToBST(head == middle ? null : head);
        parent.right = sortedListToBST(middle.next);
        return parent;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}