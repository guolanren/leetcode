package name.guolanren._101to200._131to140.p135;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CandyTest {

    private Candy candy;

    @Before
    public void before() {
        candy = new Candy();
    }

    @Test
    public void test() {
        Assert.assertEquals(5, candy.candy(new int[]{1, 0, 2}));
        Assert.assertEquals(4, candy.candy(new int[]{1, 2, 2}));
        Assert.assertEquals(7, candy.candy(new int[]{1, 3, 2, 2, 1}));
        Assert.assertEquals(13, candy.candy(new int[]{1, 2, 87, 87, 87, 2, 1}));
        Assert.assertEquals(9, candy.candy(new int[]{1, 2, 3, 1, 0}));
        Assert.assertEquals(18, candy.candy(new int[]{1, 6, 10, 8, 7, 3, 2}));
    }

}