package name.guolanren._1to100._11to20.p18;

import name.guolanren._1to100._11to20.p15._3Sum;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class _4SumTest {

    private _4Sum _4Sum;

    @Before
    public void before() {
        _4Sum = new _4Sum();
    }

    @Test
    public void test() {
        int[] nums1 = {1, 0, -1, 0, -2, 2};
        System.out.println(_4Sum.fourSum(nums1, 0));

        int[] nums2 = {2, 2, 2, 2, 2};
        System.out.println(_4Sum.fourSum(nums2, 8));
    }
}