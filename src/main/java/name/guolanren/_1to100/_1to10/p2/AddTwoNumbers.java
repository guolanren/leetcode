package name.guolanren._1to100._1to10.p2;

/**
 * @link https://leetcode.com/problems/add-two-numbers/
 * @author guolanren
 */
public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sumListNode = l1;
        ListNode currentNode = sumListNode;
        ListNode prevNode = null;
        int carry = 0;
        while (true) {
            // l1 遍历完了，将 l2 加上进位后，接到 sumListNode 尾
            if (l1 == null) {
                prevNode.next = withCarry(l2, carry);
                break;
            }
            // l2 遍历完了，将 l1 加上进位后，接到 sumListNode 尾
            if (l2 == null) {
                prevNode.next = withCarry(l1, carry);
                break;
            }

            // 计算当前节点值
            currentNode.val = l1.val + l2.val + carry;

            // 是否需要进位
            if (currentNode.val > 9) {
                currentNode.val -= 10;
                carry = 1;
            } else {
                carry = 0;
            }

            l1 = l1.next;
            l2 = l2.next;
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
        return sumListNode;
    }

    /**
     * ListNode 加上进位
     */
    private ListNode withCarry(ListNode l, int carry) {
        ListNode head = l;
        if (l != null) {
            while (true) {
                l.val += carry;

                if (l.val < 10) {
                    break;
                }

                l.val -= 10;
                carry = 1;

                if (l.next == null) {
                    l.next = new ListNode(carry);
                    break;
                }

                l = l.next;
            }
        } else if (carry > 0) {
            return new ListNode(carry);
        }
        return head;
    }
}
