package name.guolanren._1to100._61to70.p65;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class ValidNumberTest {

    private ValidNumber validNumber;

    @Before
    public void before() {
        validNumber = new ValidNumber();
    }

    @Test
    public void test() {
        Assert.assertTrue(validNumber.isNumber("0"));
        Assert.assertFalse(validNumber.isNumber("e"));
        Assert.assertFalse(validNumber.isNumber("."));
        Assert.assertTrue(validNumber.isNumber(".1"));
        Assert.assertFalse(validNumber.isNumber(".e1"));
        Assert.assertFalse(validNumber.isNumber("0e"));
        Assert.assertTrue(validNumber.isNumber(".2e81"));
    }
}