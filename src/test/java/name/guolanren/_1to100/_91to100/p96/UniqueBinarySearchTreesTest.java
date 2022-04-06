package name.guolanren._1to100._91to100.p96;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class UniqueBinarySearchTreesTest {

    private UniqueBinarySearchTrees uniqueBinarySearchTrees;

    @Before
    public void before() {
        uniqueBinarySearchTrees = new UniqueBinarySearchTrees();
    }

    @Test
    public void test() {
        Assert.assertEquals(5, uniqueBinarySearchTrees.numTrees(3));
        Assert.assertEquals(1, uniqueBinarySearchTrees.numTrees(1));
    }

}