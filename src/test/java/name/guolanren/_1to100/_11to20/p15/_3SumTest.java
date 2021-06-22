package name.guolanren._1to100._11to20.p15;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * @author guolanren
 */
public class _3SumTest {

    private _3Sum _3Sum;

    @Before
    public void before() {
        _3Sum = new _3Sum();
    }

    @Test
    public void test() {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result1 = _3Sum.threeSum(nums);
        System.out.println(result1);

        int[] nums2 = {0, 0, 0, 0};
        List<List<Integer>> result2 = _3Sum.threeSum(nums2);
        System.out.println(result2);

        int[] nums3 = {-1, 0, 1, 0};
        List<List<Integer>> result3 = _3Sum.threeSum(nums3);
        System.out.println(result3);

        int[] nums4 = {1, -1, -1, 0};
        List<List<Integer>> result4 = _3Sum.threeSum(nums4);
        System.out.println(result4);
    }

}