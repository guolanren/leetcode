package name.guolanren._1to100._81to90.p85;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class MaximalRectangleTest {

    private MaximalRectangle maximalRectangle;

    @Before
    public void before() {
        maximalRectangle = new MaximalRectangle();
    }

    @Test
    public void test() {
        Assert.assertEquals(6, maximalRectangle.maximalRectangle(
                new char[][]{
                        {'1', '0', '1', '0', '0'},
                        {'1', '0', '1', '1', '1'},
                        {'1', '1', '1', '1', '1'},
                        {'1', '0', '0', '1', '0'}
                }
            )
        );
    }

}