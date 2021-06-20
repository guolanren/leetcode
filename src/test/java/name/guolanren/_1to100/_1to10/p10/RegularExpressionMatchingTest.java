package name.guolanren._1to100._1to10.p10;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * @author guolanren
 */
public class RegularExpressionMatchingTest {

    private RegularExpressionMatching regularExpressionMatching;
    private RegularExpressionMatching2 regularExpressionMatching2;

    @Before
    public void before() {
        regularExpressionMatching = new RegularExpressionMatching();
        regularExpressionMatching2 = new RegularExpressionMatching2();
    }

    @Test
    public void test() {
        assertFalse(regularExpressionMatching.isMatch("aa", "a"));
        assertTrue(regularExpressionMatching.isMatch("aa", "a*"));
        assertTrue(regularExpressionMatching.isMatch("ab", ".*"));
        assertTrue(regularExpressionMatching.isMatch("aab", "c*a*b"));
        assertFalse(regularExpressionMatching.isMatch("mississippi", "mis*is*p*."));
    }

    @Test
    public void test2() {
        assertFalse(regularExpressionMatching2.isMatch("aa", "a"));
        assertTrue(regularExpressionMatching2.isMatch("aa", "a*"));
        assertTrue(regularExpressionMatching2.isMatch("ab", ".*"));
        assertTrue(regularExpressionMatching2.isMatch("aab", "c*a*b"));
        assertFalse(regularExpressionMatching2.isMatch("mississippi", "mis*is*p*."));
        assertTrue(regularExpressionMatching2.isMatch("mississippi", "mis*is*ip*."));
    }
}