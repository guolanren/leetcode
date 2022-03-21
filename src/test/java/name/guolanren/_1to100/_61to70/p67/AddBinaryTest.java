package name.guolanren._1to100._61to70.p67;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class AddBinaryTest {

    private AddBinary addBinary;

    @Before
    public void before() {
        addBinary = new AddBinary();
    }

    @Test
    public void test() {
        Assert.assertEquals("100", addBinary.addBinary("11", "1"));
        Assert.assertEquals("10101", addBinary.addBinary("1010", "1011"));
        Assert.assertEquals("1000", addBinary.addBinary("1", "111"));
    }

}