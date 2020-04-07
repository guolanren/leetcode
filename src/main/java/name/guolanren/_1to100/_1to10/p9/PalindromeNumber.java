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
        int reversed = 0;
        while (y > 0) {
            reversed = reversed * 10 + y % 10;
            y = y / 10;
        }
        return reversed == x;
    }

}