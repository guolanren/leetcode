package name.guolanren._1to100._1to10.p1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

    private TwoSum twoSum;
    private int[] nums;
    private int target;

    @Before
    public void before() {
        twoSum = new TwoSum();
        nums = new int[]{2, 7, 11, 15};
        target = 9;
    }

    @Test
    public void twoSum() {
        assertArrayEquals(new int[]{0, 1}, twoSum.twoSum(nums, target));
    }
}