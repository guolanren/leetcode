package name.guolanren._101to200._131to140.p132;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PalindromePartitioning2Test {

    private PalindromePartitioning2 palindromePartitioning2;

    @Before
    public void before() {
        palindromePartitioning2 = new PalindromePartitioning2();
    }

    @Test
    public void test() {
        Assert.assertEquals(0, palindromePartitioning2.minCut("aab"));
        Assert.assertEquals(0, palindromePartitioning2.minCut("ababababababababababababcbabababababababababababa"));
        Assert.assertEquals(2, palindromePartitioning2.minCut("fifgbeajcacehiicccfecbfhhgfiiecdcjjffbghdidbhbdbfbfjccgbbdcjheccfbhafehieabbdfeigbiaggchaeghaijfbjhi"));
    }

}