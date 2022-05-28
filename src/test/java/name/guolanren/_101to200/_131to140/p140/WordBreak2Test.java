package name.guolanren._101to200._131to140.p140;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class WordBreak2Test {

    private WordBreak2 wordBreak2;

    @Before
    public void before() {
        wordBreak2 = new WordBreak2();
    }

    @Test
    public void test() {
        System.out.println(wordBreak2.wordBreak("catsanddog", Arrays.asList("cat", "cats", "and", "sand", "dog")));
    }

}