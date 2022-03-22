package name.guolanren._1to100._71to80.p71;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SimplifyPathTest {

    private SimplifyPath simplifyPath;

    @Before
    public void before() {
        simplifyPath = new SimplifyPath();
    }

    @Test
    public void test() {
        Assert.assertEquals("/home", simplifyPath.simplifyPath("/home/"));
        Assert.assertEquals("/", simplifyPath.simplifyPath("/../"));
        Assert.assertEquals("/home/foo", simplifyPath.simplifyPath("/home//foo/"));
    }

}