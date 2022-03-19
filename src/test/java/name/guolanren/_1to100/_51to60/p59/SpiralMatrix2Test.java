package name.guolanren._1to100._51to60.p59;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class SpiralMatrix2Test {

    private SpiralMatrix2 spiralMatrix2;

    @Before
    public void before() {
        spiralMatrix2 = new SpiralMatrix2();
    }

    @Test
    public void test() {
        for (int[] each : spiralMatrix2.generateMatrix(3)) {
            System.out.println(Arrays.toString(each));
        }
        for (int[] each : spiralMatrix2.generateMatrix(1)) {
            System.out.println(Arrays.toString(each));
        }
    }

}