package name.guolanren._1to100._71to80.p74;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SearchA2DMatrixTest {

    private SearchA2DMatrix searchA2DMatrix;

    @Before
    public void before() {
        searchA2DMatrix = new SearchA2DMatrix();
    }

    @Test
    public void test() {
        Assert.assertEquals(true, searchA2DMatrix.searchMatrix(
                new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        Assert.assertEquals(false, searchA2DMatrix.searchMatrix(
                new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
    }

}