package name.guolanren._1to100._61to70.p70;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class ClimbingStairsTest {

    private ClimbingStairs climbingStairs;

    @Before
    public void before() {
        climbingStairs = new ClimbingStairs();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, climbingStairs.climbStairs(2));
        Assert.assertEquals(3, climbingStairs.climbStairs(3));
    }

}