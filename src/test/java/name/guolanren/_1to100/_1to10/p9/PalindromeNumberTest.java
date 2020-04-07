package name.guolanren._1to100._1to10.p9;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeNumberTest {

    private PalindromeNumber palindromeNumber;

    @Before
    public void before() {
        palindromeNumber = new PalindromeNumber();
    }

    @Test
    public void test() {
        assertTrue(palindromeNumber.isPalindrome(121));
        assertFalse(palindromeNumber.isPalindrome(-121));
        assertFalse(palindromeNumber.isPalindrome(10));
    }

}