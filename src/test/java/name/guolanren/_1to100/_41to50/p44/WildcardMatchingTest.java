package name.guolanren._1to100._41to50.p44;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class WildcardMatchingTest {

    private WildcardMatching wildcardMatching;

    @Before
    public void before() {
        wildcardMatching = new WildcardMatching();
    }

    @Test
    public void test() {
        assertFalse(wildcardMatching.isMatch("aa", "a"));
        assertTrue(wildcardMatching.isMatch("aa", "*"));
        assertFalse(wildcardMatching.isMatch("cb", "?a"));
        assertTrue(wildcardMatching.isMatch("adceb", "*a*b"));
        assertFalse(wildcardMatching.isMatch("acdcb", "a*c?b"));
        assertFalse(wildcardMatching.isMatch("babaaababaabababbbbbbaabaabbabababbaababbaaabbbaaab", "***bba**a*bbba**aab**b"));
    }
}