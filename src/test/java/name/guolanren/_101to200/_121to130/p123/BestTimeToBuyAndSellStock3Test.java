package name.guolanren._101to200._121to130.p123;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class BestTimeToBuyAndSellStock3Test {

    private BestTimeToBuyAndSellStock3 bestTimeToBuyAndSellStock3;

    @Before
    public void before() {
        bestTimeToBuyAndSellStock3 = new BestTimeToBuyAndSellStock3();
    }

    @Test
    public void test() {
        Assert.assertEquals(6, bestTimeToBuyAndSellStock3.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

}