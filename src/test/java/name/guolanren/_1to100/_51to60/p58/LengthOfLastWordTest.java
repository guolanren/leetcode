package name.guolanren._1to100._51to60.p58;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class LengthOfLastWordTest {

    private LengthOfLastWord lengthOfLastWord;

    @Before
    public void before() {
        lengthOfLastWord = new LengthOfLastWord();
    }

    @Test
    public void test() {
        Assert.assertEquals(5, lengthOfLastWord.lengthOfLastWord("Hello World"));
        Assert.assertEquals(4, lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
        Assert.assertEquals(6, lengthOfLastWord.lengthOfLastWord("luffy is still joyboy"));
    }

}