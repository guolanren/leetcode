package name.guolanren._1to100._61to70.p62;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class UniquePathsTest {

    private UniquePaths uniquePaths;

    @Before
    public void before() {
        uniquePaths = new UniquePaths();
    }

    @Test
    public void test() {
        Assert.assertEquals(28, uniquePaths.uniquePaths(3, 7));
        Assert.assertEquals(3, uniquePaths.uniquePaths(3, 2));
    }

}