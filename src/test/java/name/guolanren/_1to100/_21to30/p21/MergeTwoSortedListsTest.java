package name.guolanren._1to100._21to30.p21;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class MergeTwoSortedListsTest {

    private MergeTwoSortedLists mergeTwoSortedLists;

    @Before
    public void before() {
        mergeTwoSortedLists = new MergeTwoSortedLists();
    }

    @Test
    public void test() {
//        ListNode l1n3 = new ListNode(4);
//        ListNode l1n2 = new ListNode(2, l1n3);
//        ListNode l1n1 = new ListNode(1, l1n2);
//        ListNode l2n3 = new ListNode(4);
//        ListNode l2n2 = new ListNode(3, l2n3);
//        ListNode l2n1 = new ListNode(1, l2n2);
//        System.out.println(mergeTwoSortedLists.mergeTwoLists(l1n1, l2n1));


//        System.out.println(mergeTwoSortedLists.mergeTwoLists(null, null));

        ListNode l2n1 = new ListNode(0);
        System.out.println(mergeTwoSortedLists.mergeTwoLists(null, l2n1));
    }
}