package name.guolanren._1to100._1to10.p6;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZigzagConversionTest {

    private ZigzagConversion zigzagConversion;

    @Before
    public void before() {
        zigzagConversion = new ZigzagConversion();
    }

    @Test
    public void test1() {
        String s = "LEETCODEISHIRING";
        int numRows = 3;
        assertEquals("LCIRETOESIIGEDHN", zigzagConversion.convert(s, numRows));
    }

    @Test
    public void test2() {
        String s = "LEETCODEISHIRING";
        int numRows = 4;
        assertEquals("LDREOEIIECIHNTSG", zigzagConversion.convert(s, numRows));
    }
}