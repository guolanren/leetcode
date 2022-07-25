package name.guolanren._101to200._141to150.p149;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MaxPointsOnALineTest {

    private MaxPointsOnALine maxPointsOnALine;

    @Before
    public void before() {
        maxPointsOnALine = new MaxPointsOnALine();
    }

    @Test
    public void test() {
        Assert.assertEquals(3, maxPointsOnALine.maxPoints(new int[][]{{1, 1}, {2, 2}, {3, 3}}));
        Assert.assertEquals(4, maxPointsOnALine.maxPoints(new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}}));
    }

}