package name.guolanren._1to100._21to30.p22;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class GenerateParenthesesTest {

    private GenerateParentheses generateParentheses;

    @Before
    public void before() {
        generateParentheses = new GenerateParentheses();
    }

    @Test
    public void test() {
        assertEquals(5, generateParentheses.generateParenthesis(3).size());
        assertEquals(1, generateParentheses.generateParenthesis(1).size());
    }
}