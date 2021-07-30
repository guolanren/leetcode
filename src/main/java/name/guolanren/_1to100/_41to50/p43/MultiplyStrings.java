package name.guolanren._1to100._41to50.p43;

/**
 * @link https://leetcode.com/problems/multiply-strings/
 * @author guolanren
 */
public class MultiplyStrings {

    public String multiply(String num1, String num2) {
        if ("0".equals(num1) || "0".equals(num2)) {
            return "0";
        }
        int[] mulDigits = new int[num1.length() + num2.length()];
        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                int digit = Character.getNumericValue(num1.charAt(i)) * Character.getNumericValue(num2.charAt(j));
                mulDigits[i + j] += (mulDigits[i + j + 1] + digit) / 10;
                mulDigits[i + j + 1] = (mulDigits[i + j + 1] + digit) % 10;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < mulDigits.length; i++) {
            if ((mulDigits[i] != 0 || sb.length() != 0) || i == mulDigits.length - 1) {
                sb.append(mulDigits[i]);
            }
        }

        return sb.toString();
    }

}
