package name.guolanren._101to200._131to140.p136;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumberTest {

    private SingleNumber singleNumber;

    @Before
    public void before() {
        singleNumber = new SingleNumber();
    }

    @Test
    public void test() {
        Assert.assertEquals(1, singleNumber.singleNumber(new int[]{2, 2, 1}));
    }

}