package name.guolanren._101to200._121to130.p121;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @Before
    public void before() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    public void test() {
        Assert.assertEquals(5, bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

}