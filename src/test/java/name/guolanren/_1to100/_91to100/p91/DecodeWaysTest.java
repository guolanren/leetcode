package name.guolanren._1to100._91to100.p91;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DecodeWaysTest {

    private DecodeWays decodeWays;

    @Before
    public void before() {
        decodeWays = new DecodeWays();
    }

    @Test
    public void test() {
        Assert.assertEquals(2, decodeWays.numDecodings("12"));
        Assert.assertEquals(3, decodeWays.numDecodings("226"));
        Assert.assertEquals(0, decodeWays.numDecodings("06"));
    }

}