package name.guolanren._101to200._121to130.p125;

/**
 * @link https://leetcode.com/problems/valid-palindrome/
 * @author guolanren
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            } else if (!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            } else {
                Character lowerLeft = Character.toLowerCase(s.charAt(left));
                Character lowerRight = Character.toLowerCase(s.charAt(right));
                if (lowerLeft.equals(lowerRight)) {
                    left++;
                    right--;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

}
