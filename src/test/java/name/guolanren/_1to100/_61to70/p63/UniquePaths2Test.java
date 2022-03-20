package name.guolanren._1to100._61to70.p63;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class UniquePaths2Test {

    private UniquePaths2 uniquePaths2;

    @Before
    public void before() {
        uniquePaths2 = new UniquePaths2();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, uniquePaths2.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

}