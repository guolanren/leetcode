package name.guolanren._1to100._21to30.p23;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class MergeKSortedListsTest {

    private MergeKSortedLists mergeKSortedLists;

    @Before
    public void before() {
        mergeKSortedLists = new MergeKSortedLists();
    }

    @Test
    public void test() {
        ListNode l1 = null;
        ListNode[] lists = new ListNode[]{l1};
        System.out.println(mergeKSortedLists.mergeKLists(lists));
    }
}