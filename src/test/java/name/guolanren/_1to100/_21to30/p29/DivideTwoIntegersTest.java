package name.guolanren._1to100._21to30.p29;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class DivideTwoIntegersTest {

    private DivideTwoIntegers divideTwoIntegers;

    @Before
    public void before() {
        divideTwoIntegers = new DivideTwoIntegers();
    }

    @Test
    public void test() {
        assertEquals(3, divideTwoIntegers.divide(10, 3));
        assertEquals(-2, divideTwoIntegers.divide(7, -3));
        assertEquals(0, divideTwoIntegers.divide(0, 1));
        assertEquals(1, divideTwoIntegers.divide(1, 1));
        assertEquals(1, divideTwoIntegers.divide(-1, -1));
        assertEquals(-1073741824, divideTwoIntegers.divide(-2147483648, 2));
    }
}