package name.guolanren._1to100._11to20.p12;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class IntegerToRomanTest {

    private IntegerToRoman integerToRoman;

    @Before
    public void before() {
        integerToRoman = new IntegerToRoman();
    }

    @Test
    public void test() {
        assertEquals("III", integerToRoman.intToRoman(3));
        assertEquals("IV", integerToRoman.intToRoman(4));
        assertEquals("IX", integerToRoman.intToRoman(9));
        assertEquals("LVIII", integerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }

}