package name.guolanren._1to100._91to100.p93;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class RestoreIPAddressesTest {

    private RestoreIPAddresses restoreIPAddresses;

    @Before
    public void before() {
        restoreIPAddresses = new RestoreIPAddresses();
    }

    @Test
    public void test() {
        System.out.println(restoreIPAddresses.restoreIpAddresses("25525511135"));
        System.out.println(restoreIPAddresses.restoreIpAddresses("0000"));
        System.out.println(restoreIPAddresses.restoreIpAddresses("101023"));
    }

}