package name.guolanren._1to100._51to60.p53;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class MaximumSubarrayTest {

    private MaximumSubarray maximumSubarray;

    @Before
    public void before() {
        maximumSubarray = new MaximumSubarray();
    }

    @Test
    public void test() {
        Assert.assertEquals(6, maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        Assert.assertEquals(1, maximumSubarray.maxSubArray(new int[]{1}));
        Assert.assertEquals(23, maximumSubarray.maxSubArray(new int[]{5, 4, -1, 7, 8}));
        Assert.assertEquals(1, maximumSubarray.maxSubArray(new int[]{-2, 1}));
    }

}