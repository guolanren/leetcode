package name.guolanren._1to100._31to40.p38;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class CountAndSayTest {

    private CountAndSay countAndSay;

    @Before
    public void before() {
        countAndSay = new CountAndSay();
    }

    @Test
    public void test() {
        assertEquals("1", countAndSay.countAndSay(1));
        assertEquals("11", countAndSay.countAndSay(2));
        assertEquals("21", countAndSay.countAndSay(3));
        assertEquals("1211", countAndSay.countAndSay(4));
    }
}