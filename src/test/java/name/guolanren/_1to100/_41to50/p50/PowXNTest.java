package name.guolanren._1to100._41to50.p50;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class PowXNTest {

    private PowXN powXN;

    @Before
    public void before() {
        powXN = new PowXN();
    }

    @Test
    public void test() {
        System.out.println(powXN.myPow(2.00000, 10));
        System.out.println(powXN.myPow(2.10000, 3));
        System.out.println(powXN.myPow(2.00000, -2));
    }
}