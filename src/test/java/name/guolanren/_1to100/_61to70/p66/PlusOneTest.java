package name.guolanren._1to100._61to70.p66;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class PlusOneTest {

    private PlusOne plusOne;

    @Before
    public void before() {
        plusOne = new PlusOne();
    }

    @Test
    public void test() {
        Assert.assertArrayEquals(new int[]{1, 2, 4}, plusOne.plusOne(new int[]{1, 2, 3}));
        Assert.assertArrayEquals(new int[]{4, 3, 2, 2}, plusOne.plusOne(new int[]{4, 3, 2, 1}));
        Assert.assertArrayEquals(new int[]{1, 0}, plusOne.plusOne(new int[]{9}));
    }

}