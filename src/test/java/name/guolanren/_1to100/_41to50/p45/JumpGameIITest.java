package name.guolanren._1to100._41to50.p45;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class JumpGameIITest {

    private JumpGameII jumpGameII;

    @Before
    public void before() {
        jumpGameII = new JumpGameII();
    }

    @Test
    public void test() {
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(2, jumpGameII.jump(new int[]{2, 3, 0, 1, 4}));
        assertEquals(3, jumpGameII.jump(new int[]{5, 9, 3, 2, 1, 0, 2, 3, 3, 1, 0, 0}));
        assertEquals(5, jumpGameII.jump(new int[]{5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5}));
    }
}