package name.guolanren._101to200._131to140.p131;

import org.junit.Before;
import org.junit.Test;

public class PalindromePartitioningTest {

    private PalindromePartitioning palindromePartitioning;

    @Before
    public void before() {
        palindromePartitioning = new PalindromePartitioning();
    }

    @Test
    public void test() {
        System.out.println(palindromePartitioning.partition("aab"));
    }

}