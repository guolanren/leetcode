package name.guolanren._1to100._61to70.p61;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class RotateListTest {

    private RotateList rotateList;

    @Before
    public void before() {
        rotateList = new RotateList();
    }

    @Test
    public void test() {
        ListNode node5 = new ListNode(5);
        ListNode node4 = new ListNode(4, node5);
        ListNode node3 = new ListNode(3, node4);
        ListNode node2 = new ListNode(2, node3);
        ListNode node1 = new ListNode(1, node2);
        ListNode head = rotateList.rotateRight(node1, 2);
        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val + "->");
            cur = cur.next;
        }
    }

}