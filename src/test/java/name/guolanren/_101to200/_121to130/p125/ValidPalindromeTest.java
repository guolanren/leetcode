package name.guolanren._101to200._121to130.p125;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class ValidPalindromeTest {

    private ValidPalindrome validPalindrome;

    @Before
    public void before() {
        validPalindrome = new ValidPalindrome();
    }

    @Test
    public void test() {
        Assert.assertFalse(validPalindrome.isPalindrome("0P"));
    }

}