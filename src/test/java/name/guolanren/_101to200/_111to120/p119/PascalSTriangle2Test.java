package name.guolanren._101to200._111to120.p119;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class PascalSTriangle2Test {

    private PascalSTriangle2 pascalSTriangle2;

    @Before
    public void before() {
        pascalSTriangle2 = new PascalSTriangle2();
    }

    @Test
    public void test() {
        System.out.println(pascalSTriangle2.getRow(0));
        System.out.println(pascalSTriangle2.getRow(1));
        System.out.println(pascalSTriangle2.getRow(2));
        System.out.println(pascalSTriangle2.getRow(3));
    }

}