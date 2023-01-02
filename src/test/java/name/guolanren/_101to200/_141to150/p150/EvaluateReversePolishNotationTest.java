package name.guolanren._101to200._141to150.p150;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class EvaluateReversePolishNotationTest {

    private EvaluateReversePolishNotation evaluateReversePolishNotation;

    @Before
    public void before() {
        evaluateReversePolishNotation = new EvaluateReversePolishNotation();
    }

    @Test
    public void test() {
        Assert.assertEquals(9, evaluateReversePolishNotation.evalRPN(new String[]{"2", "1", "+", "3", "*"}));
        Assert.assertEquals(6, evaluateReversePolishNotation.evalRPN(new String[]{"4", "13", "5", "/", "+"}));
        Assert.assertEquals(22, evaluateReversePolishNotation.evalRPN(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

}