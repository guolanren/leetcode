package name.guolanren._1to100._11to20.p19;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class RemoveNthNodeFromEndOfListTest {

    private RemoveNthNodeFromEndOfList removeNthNodeFromEndOfList;

    @Before
    public void before() {
        removeNthNodeFromEndOfList = new RemoveNthNodeFromEndOfList();
    }

    @Test
    public void test() {
//        ListNode n5 = new ListNode(5);
//        ListNode n4 = new ListNode(4, n5);
//        ListNode n3 = new ListNode(3, n4);
//        ListNode n2 = new ListNode(2, n3);
//        ListNode n1 = new ListNode(1, n2);
//        System.out.println(removeNthNodeFromEndOfList.removeNthFromEnd(n1, 2));

//        ListNode n1 = new ListNode(1);
//        System.out.println(removeNthNodeFromEndOfList.removeNthFromEnd(n1, 1));

        ListNode n2 = new ListNode(2);
        ListNode n1 = new ListNode(1, n2);
        System.out.println(removeNthNodeFromEndOfList.removeNthFromEnd(n1, 1));
    }
}