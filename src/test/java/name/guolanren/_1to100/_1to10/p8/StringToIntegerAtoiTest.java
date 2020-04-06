package name.guolanren._1to100._1to10.p8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringToIntegerAtoiTest {

    private StringToIntegerAtoi stringToIntegerAtoi;

    @Before
    public void before() {
        stringToIntegerAtoi = new StringToIntegerAtoi();
    }

    @Test
    public void test1() {
        String str = "42";
        assertEquals(42, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test2() {
        String str = "   -42";
        assertEquals(-42, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test3() {
        String str = "4193 with words";
        assertEquals(4193, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test4() {
        String str = "words and 987";
        assertEquals(0, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test5() {
        String str = "-91283472332";
        assertEquals(-2147483648, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test6() {
        String str = "   +0 123";
        assertEquals(0, stringToIntegerAtoi.myAtoi(str));
    }

    @Test
    public void test7() {
        String str = "     -11009215950h";
        assertEquals(-2147483648, stringToIntegerAtoi.myAtoi(str));
    }
}