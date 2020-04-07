package name.guolanren._1to100._1to10.p9;

/**
 * @link https://leetcode.com/problems/palindrome-number/
 * @author guolanren
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int palindromeNumber = 0;
        while (y > 0) {
            int tail = y % 10;
            palindromeNumber = palindromeNumber * 10 + tail;
            y = y / 10;
        }
        return palindromeNumber == x;
    }

}