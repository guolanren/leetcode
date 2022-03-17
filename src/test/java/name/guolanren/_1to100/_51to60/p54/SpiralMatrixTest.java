package name.guolanren._1to100._51to60.p54;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SpiralMatrixTest {

    private SpiralMatrix spiralMatrix;

    @Before
    public void before() {
        spiralMatrix = new SpiralMatrix();
    }

    @Test
    public void test() {
        System.out.println(spiralMatrix.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        System.out.println(spiralMatrix.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

}