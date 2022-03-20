package name.guolanren._1to100._61to70.p64;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class MinimumPathSumTest {

    private MinimumPathSum minimumPathSum;

    @Before
    public void before() {
        minimumPathSum = new MinimumPathSum();
    }

    @Test
    public void test() {
        Assert.assertEquals(7, minimumPathSum.minPathSum((new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}})));
        Assert.assertEquals(12, minimumPathSum.minPathSum((new int[][]{{1, 2, 3}, {4, 5, 6}})));
    }

}