package name.guolanren._101to200._121to130.p127;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class WordLadderTest {

    private WordLadder wordLadder;

    @Before
    public void before() {
        wordLadder = new WordLadder();
    }

    @Test
    public void test() {
        Assert.assertEquals(5, wordLadder.ladderLength("hit", "cog", Arrays.asList("hot", "dot", "dog", "lot", "log", "cog")));
    }

}