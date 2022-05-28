package name.guolanren._101to200._131to140.p139;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class WordBreakTest {

    private WordBreak wordBreak;

    @Before
    public void before() {
        wordBreak = new WordBreak();
    }

    @Test
    public void test() {
        Assert.assertTrue(wordBreak.wordBreak("leetcode", Arrays.asList("leet", "code")));
        Assert.assertTrue(wordBreak.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
        Assert.assertFalse(wordBreak.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

}