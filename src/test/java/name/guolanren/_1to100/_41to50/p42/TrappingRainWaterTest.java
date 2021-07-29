package name.guolanren._1to100._41to50.p42;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class TrappingRainWaterTest {

    private TrappingRainWater trappingRainWater;

    @Before
    public void before() {
        trappingRainWater = new TrappingRainWater();
    }

    @Test
    public void test() {
        assertEquals(6, trappingRainWater.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(9, trappingRainWater.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}