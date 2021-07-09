package name.guolanren._1to100._21to30.p28;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class ImplementStrStrTest {

    ImplementStrStr implementStrStr;

    @Before
    public void before() {
        implementStrStr = new ImplementStrStr();
    }

    @Test
    public void test() {
        assertEquals(2, implementStrStr.strStr("hello", "ll"));
        assertEquals(-1, implementStrStr.strStr("aaaaa", "bba"));
        assertEquals(0, implementStrStr.strStr("", ""));
    }
}