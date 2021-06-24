package name.guolanren._1to100._11to20.p16;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class _3SumClosestTest {

    private _3SumClosest _3SumClosest;

    @Before
    public void before() throws Exception {
        _3SumClosest = new _3SumClosest();
    }

    @Test
    public void test() {
        int[] nums = {-1, 2, 1, -4};
        assertEquals(2, _3SumClosest.threeSumClosest(nums, 1));

        int[] nums2 = {1, 2, 4, 8, 16, 32, 64, 128};
        assertEquals(82, _3SumClosest.threeSumClosest(nums2, 82));
    }
}