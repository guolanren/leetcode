package name.guolanren._1to100._61to70.p69;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SqrtXTest {

    private SqrtX sqrtX;

    @Before
    public void before() {
        sqrtX = new SqrtX();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, sqrtX.mySqrt(4));
        Assert.assertEquals(2, sqrtX.mySqrt(8));
    }

}