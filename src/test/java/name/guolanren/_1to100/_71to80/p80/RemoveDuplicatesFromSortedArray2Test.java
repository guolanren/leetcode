package name.guolanren._1to100._71to80.p80;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedArray2Test {

    private RemoveDuplicatesFromSortedArray2 removeDuplicatesFromSortedArray2;

    @Before
    public void before() {
        removeDuplicatesFromSortedArray2 = new RemoveDuplicatesFromSortedArray2();
    }

    @Test
    public void test() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        System.out.println(removeDuplicatesFromSortedArray2.removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));

        int[] nums2 = new int[]{0, 0, 1, 1, 1, 1, 2, 3, 3, 3, 3};
        System.out.println(removeDuplicatesFromSortedArray2.removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = new int[]{1, 2, 2};
        System.out.println(removeDuplicatesFromSortedArray2.removeDuplicates(nums3));
        System.out.println(Arrays.toString(nums3));
    }

}