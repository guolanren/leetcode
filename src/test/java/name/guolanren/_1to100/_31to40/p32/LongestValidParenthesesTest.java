package name.guolanren._1to100._31to40.p32;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class LongestValidParenthesesTest {

    private LongestValidParentheses longestValidParentheses;

    @Before
    public void before() {
        longestValidParentheses = new LongestValidParentheses();
    }

    @Test
    public void test() {
        assertEquals(2, longestValidParentheses.longestValidParentheses("(()"));
        assertEquals(4, longestValidParentheses.longestValidParentheses(")()())"));
        assertEquals(0, longestValidParentheses.longestValidParentheses(""));
    }
}