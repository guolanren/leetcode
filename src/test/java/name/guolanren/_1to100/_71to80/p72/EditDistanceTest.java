package name.guolanren._1to100._71to80.p72;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class EditDistanceTest {

    private EditDistance editDistance;

    @Before
    public void before() {
        editDistance = new EditDistance();
    }

    @Test
    public void test() {
        Assert.assertEquals(3, editDistance.minDistance("horse", "ros"));
        Assert.assertEquals(5, editDistance.minDistance("intention", "execution"));
    }

}