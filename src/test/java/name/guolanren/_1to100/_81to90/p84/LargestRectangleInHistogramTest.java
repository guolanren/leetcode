package name.guolanren._1to100._81to90.p84;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class LargestRectangleInHistogramTest {

    private LargestRectangleInHistogram largestRectangleInHistogram;

    @Before
    public void before() {
        largestRectangleInHistogram = new LargestRectangleInHistogram();
    }

    @Test
    public void test() {
        Assert.assertEquals(10, largestRectangleInHistogram.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
        Assert.assertEquals(4, largestRectangleInHistogram.largestRectangleArea(new int[]{2, 4}));
    }

}