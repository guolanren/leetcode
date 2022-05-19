package name.guolanren._101to200._131to140.p137;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SingleNumber2Test {

    private SingleNumber2 singleNumber2;

    @Before
    public void before() {
        singleNumber2 = new SingleNumber2();
    }

    @Test
    public void test() {
        Assert.assertEquals(1, singleNumber2.singleNumber(new int[]{2, 2, 2, 1}));
    }

}