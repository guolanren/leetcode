package name.guolanren._1to100._91to100.p97;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class InterleavingStringTest {

    private InterleavingString interleavingString;

    @Before
    public void before() {
        interleavingString = new InterleavingString();
    }

    @Test
    public void test() {
        Assert.assertTrue(interleavingString.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        Assert.assertFalse(interleavingString.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        Assert.assertTrue(interleavingString.isInterleave("", "", ""));
        Assert.assertFalse(interleavingString.isInterleave("db", "b", "cbb"));
    }

}