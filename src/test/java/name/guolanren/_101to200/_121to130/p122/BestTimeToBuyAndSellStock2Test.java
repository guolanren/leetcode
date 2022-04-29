package name.guolanren._101to200._121to130.p122;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTimeToBuyAndSellStock2Test {

    private BestTimeToBuyAndSellStock2 bestTimeToBuyAndSellStock2;

    @Before
    public void before() {
        bestTimeToBuyAndSellStock2 = new BestTimeToBuyAndSellStock2();
    }

    @Test
    public void test() {
        Assert.assertEquals(7, bestTimeToBuyAndSellStock2.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

}