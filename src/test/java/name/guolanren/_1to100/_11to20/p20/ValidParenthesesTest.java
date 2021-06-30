package name.guolanren._1to100._11to20.p20;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class ValidParenthesesTest {

    private ValidParentheses validParentheses;

    @Before
    public void before() {
        validParentheses = new ValidParentheses();
    }

    @Test
    public void test() {
        assertTrue(validParentheses.isValid("()"));
        assertTrue(validParentheses.isValid("()[]{}"));
        assertFalse(validParentheses.isValid("(]"));
        assertFalse(validParentheses.isValid("([)]"));
        assertTrue(validParentheses.isValid("{[]}"));
    }
}