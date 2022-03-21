package name.guolanren._1to100._61to70.p66;

/**
 * @link https://leetcode.com/problems/plus-one/
 * @author guolanren
 */
public class PlusOne {

    public int[] plusOne(int[] digits) {
        int plus = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            int sum = digits[i] + plus;
            digits[i] = sum % 10;
            plus = sum / 10;
        }
        if (plus > 0) {
            int[] tmp = new int[digits.length + 1];
            tmp[0] = plus;
            for (int i = 0; i < digits.length; i++) {
                tmp[i + 1] = digits[i];
            }
            digits = tmp;
        }
        return digits;
    }

}
