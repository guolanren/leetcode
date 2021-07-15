package name.guolanren._1to100._31to40.p31;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class NextPermutationTest {

    private NextPermutation nextPermutation;

    @Before
    public void before() {
        nextPermutation = new NextPermutation();
    }

    @Test
    public void test() {
        int[] nums = new int[]{1, 2, 3};
        nextPermutation.nextPermutation(nums);
        assertArrayEquals(new int[]{1, 3, 2}, nums);

        int[] nums2 = new int[]{3, 2, 1};
        nextPermutation.nextPermutation(nums2);
        assertArrayEquals(new int[]{1, 2, 3}, nums2);

        int[] nums3 = new int[]{1, 1, 5};
        nextPermutation.nextPermutation(nums3);
        assertArrayEquals(new int[]{1, 5, 1}, nums3);

        int[] nums4 = new int[]{1};
        nextPermutation.nextPermutation(nums4);
        assertArrayEquals(new int[]{1}, nums4);
    }
}