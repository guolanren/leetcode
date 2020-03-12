package name.guolanren._1to100._1to10.p2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumbersTest {

    private AddTwoNumbers addTwoNumbers;
    private ListNode l1;
    private ListNode l2;

    @Before
    public void before() {
        addTwoNumbers = new AddTwoNumbers();

        ListNode l1_1 = new ListNode(2);
        ListNode l1_2 = new ListNode(4);
        ListNode l1_3 = new ListNode(3);
        ListNode l1_4 = new ListNode(7);

        l1_1.next = l1_2;
        l1_2.next = l1_3;
        l1_3.next = l1_4;
        l1 = l1_1;

        ListNode l2_1 = new ListNode(5);
        ListNode l2_2 = new ListNode(6);
        ListNode l2_3 = new ListNode(4);

        l2_1.next = l2_2;
        l2_2.next = l2_3;
        l2 = l2_1;
    }

    @Test
    public void addTwoNumbers() {
        ListNode sumListNode = addTwoNumbers.addTwoNumbers(l1, l2);
        ListNode currentNode = sumListNode;
        assertEquals(7, currentNode.val);
        currentNode = currentNode.next;
        assertEquals(0, currentNode.val);
        currentNode = currentNode.next;
        assertEquals(8, currentNode.val);
        currentNode = currentNode.next;
        assertEquals(7, currentNode.val);
    }
}