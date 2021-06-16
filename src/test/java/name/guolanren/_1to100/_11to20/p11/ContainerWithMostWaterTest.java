package name.guolanren._1to100._11to20.p11;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class ContainerWithMostWaterTest {

    private ContainerWithMostWater containerWithMostWater;

    @Before
    public void before() {
        containerWithMostWater = new ContainerWithMostWater();
    }

    @Test
    public void test() {
        int[] exampleHeight1 = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, containerWithMostWater.maxArea(exampleHeight1));

        int[] exampleHeight2 = {1,1};
        assertEquals(1, containerWithMostWater.maxArea(exampleHeight2));

        int[] exampleHeight3 = {4,3,2,1,4};
        assertEquals(16, containerWithMostWater.maxArea(exampleHeight3));

        int[] exampleHeight4 = {1,2,1};
        assertEquals(2, containerWithMostWater.maxArea(exampleHeight4));
    }
}