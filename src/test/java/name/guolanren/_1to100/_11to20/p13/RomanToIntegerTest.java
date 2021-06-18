package name.guolanren._1to100._11to20.p13;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class RomanToIntegerTest {

    private RomanToInteger romanToInteger;

    @Before
    public void before() {
        romanToInteger = new RomanToInteger();
    }

    @Test
    public void test() {
        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(4, romanToInteger.romanToInt("IV"));
        assertEquals(9, romanToInteger.romanToInt("IX"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }

}