package name.guolanren._101to200._121to130.p128;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class LongestConsecutiveSequenceTest {

    private LongestConsecutiveSequence longestConsecutiveSequence;

    @Before
    public void before() {
        longestConsecutiveSequence = new LongestConsecutiveSequence();
    }

    @Test
    public void test() {
        Assert.assertEquals(4, longestConsecutiveSequence.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2}));
    }

}