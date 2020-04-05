package name.guolanren._1to100._1to10.p7;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    private ReverseInteger reverseInteger;

    @Before
    public void before() {
        reverseInteger = new ReverseInteger();
    }

    @Test
    public void test1() {
        int x = 123;
        assertEquals(321, reverseInteger.reverse(x));
    }

    @Test
    public void test2() {
        int x = -123;
        assertEquals(-321, reverseInteger.reverse(x));
    }

    @Test
    public void test3() {
        int x = 120;
        assertEquals(21, reverseInteger.reverse(x));
    }

    @Test
    public void test4() {
        int x = 1534236469;
        assertEquals(0, reverseInteger.reverse(x));
    }

}