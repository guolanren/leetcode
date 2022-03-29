package name.guolanren._1to100._81to90.p87;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class ScrambleStringTest {

    private ScrambleString scrambleString;

    @Before
    public void before() {
        scrambleString = new ScrambleString();
    }

    @Test
    public void test() {
        Assert.assertEquals(true, scrambleString.isScramble("great", "rgeat"));
    }

}