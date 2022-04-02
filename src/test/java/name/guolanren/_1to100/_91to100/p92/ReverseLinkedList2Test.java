package name.guolanren._1to100._91to100.p92;

import org.junit.Before;
import org.junit.Test;

public class ReverseLinkedList2Test {

    private ReverseLinkedList2 reverseLinkedList2;

    @Before
    public void before() {
        reverseLinkedList2 = new ReverseLinkedList2();
    }

    @Test
    public void test() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode res = reverseLinkedList2.reverseBetween(node1, 2, 4);
        while (res != null) {
            System.out.print(res.val + "->");
            res = res.next;
        }
    }

}