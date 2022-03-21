package name.guolanren._1to100._61to70.p67;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/add-binary/
 * @author guolanren
 */
public class AddBinary {

    public String addBinary(String a, String b) {
        StringBuilder binSum = new StringBuilder("");
        int plus = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;
        if (i < j) {
            String tmp = b;
            b = a;
            a = tmp;
        }

        int diff = a.length() - b.length();
        char[] zeroFill = new char[diff];
        Arrays.fill(zeroFill, '0');
        b = String.valueOf(zeroFill) + b;

        i = a.length() - 1;
        while (i >= 0) {
            int binA = Character.getNumericValue(a.charAt(i));
            int binB = Character.getNumericValue(b.charAt(i));
            int sum = binA + binB + plus;

            plus = sum / 2;
            binSum = binSum.insert(0, sum & 1);
            i--;
        }

        if (plus > 0) {
            binSum = binSum.insert(0, plus);
        }

        return binSum.toString();
    }

}
