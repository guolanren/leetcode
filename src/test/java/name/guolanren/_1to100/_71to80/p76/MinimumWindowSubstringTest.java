package name.guolanren._1to100._71to80.p76;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class MinimumWindowSubstringTest {

    private MinimumWindowSubstring minimumWindowSubstring;

    @Before
    public void before() {
        minimumWindowSubstring = new MinimumWindowSubstring();
    }

    @Test
    public void test() {
        Assert.assertEquals("BANC", minimumWindowSubstring.minWindow("ADOBECODEBANC", "ABC"));
        Assert.assertEquals("a", minimumWindowSubstring.minWindow("a", "a"));
        Assert.assertEquals("", minimumWindowSubstring.minWindow("a", "aa"));
    }

}