package name.guolanren._1to100._81to90.p88;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class MergeSortedArrayTest {

    private MergeSortedArray mergeSortedArray;

    @Before
    public void before() {
        mergeSortedArray = new MergeSortedArray();
    }

    @Test
    public void test() {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        mergeSortedArray.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

}