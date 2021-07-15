package name.guolanren._1to100._21to30.p30;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class SubstringWithConcatenationOfAllWordsTest {

    private SubstringWithConcatenationOfAllWords substringWithConcatenationOfAllWords;

    @Before
    public void before() {
        substringWithConcatenationOfAllWords = new SubstringWithConcatenationOfAllWords();
    }

    @Test
    public void test() {
//        List<Integer> indices = substringWithConcatenationOfAllWords.findSubstring("barfoothefoobarman", new String[]{"foo", "bar"});
//        assertEquals(2, indices.size());
//        System.out.println(indices);
//
//        List<Integer> indices2 = substringWithConcatenationOfAllWords.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "word"});
//        assertEquals(0, indices2.size());
//        System.out.println(indices2);
//
//        List<Integer> indices3 = substringWithConcatenationOfAllWords.findSubstring("barfoofoobarthefoobarman", new String[]{"bar", "foo", "the"});
//        assertEquals(3, indices3.size());
//        System.out.println(indices3);

        List<Integer> indices4 = substringWithConcatenationOfAllWords.findSubstring("wordgoodgoodgoodbestword", new String[]{"word", "good", "best", "good"});
        assertEquals(1, indices4.size());
        System.out.println(indices4);
    }
}