package name.guolanren._1to100._71to80.p79;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class WordSearchTest {

    private WordSearch wordSearch;

    @Before
    public void before() {
        wordSearch = new WordSearch();
    }

    @Test
    public void test() {
        Assert.assertEquals(false, wordSearch.exist(
                new char[][]{
                        {'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A'},
                        {'A', 'A', 'A', 'A', 'A'}}, "AAAAAAAAAAAAAAB"));

        Assert.assertEquals(true, wordSearch.exist(
                new char[][]{
                        {'A', 'B', 'C', 'E'},
                        {'S', 'F', 'E', 'S'},
                        {'A', 'D', 'E', 'E'}}, "ABCESEEEFS"));

        Assert.assertEquals(true, wordSearch.exist(
                new char[][]{
                        {'C', 'A', 'A'},
                        {'A', 'A', 'A'},
                        {'B', 'C', 'D'}}, "AAB"));
    }

}