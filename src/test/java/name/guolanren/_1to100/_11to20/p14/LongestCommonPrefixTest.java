package name.guolanren._1to100._11to20.p14;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class LongestCommonPrefixTest {

    private LongestCommonPrefix longestCommonPrefix;

    @Before
    public void before() {
        longestCommonPrefix = new LongestCommonPrefix();
    }

    @Test
    public void test() {
        String[] strs1 = {"flower", "flow", "flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(strs1));

        String[] strs2 = {"dog", "racecar", "car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(strs2));
    }

}