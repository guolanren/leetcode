package name.guolanren._1to100._41to50.p43;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class MultiplyStringsTest {

    private MultiplyStrings multiplyStrings;

    @Before
    public void before() {
        multiplyStrings = new MultiplyStrings();
    }

    @Test
    public void test() {
        assertEquals("6", multiplyStrings.multiply("2", "3"));
        assertEquals("56088", multiplyStrings.multiply("123", "456"));
        assertEquals("2040", multiplyStrings.multiply("408", "5"));
    }
}