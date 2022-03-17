package name.guolanren._1to100._51to60.p55;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class JumpGameTest {

    private JumpGame jumpGame;

    @Before
    public void before() {
        jumpGame = new JumpGame();
    }

    @Test
    public void test() {
        Assert.assertTrue(jumpGame.canJump(new int[]{2, 3, 1, 1, 4}));
        Assert.assertFalse(jumpGame.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}