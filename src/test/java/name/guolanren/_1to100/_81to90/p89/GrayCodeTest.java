package name.guolanren._1to100._81to90.p89;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class GrayCodeTest {

    private GrayCode grayCode;

    @Before
    public void before() {
        grayCode = new GrayCode();
    }

    @Test
    public void test() {
        System.out.println(grayCode.grayCode(2));
        System.out.println(grayCode.grayCode(1));
    }

}