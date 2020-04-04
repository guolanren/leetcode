package name.guolanren._1to100._1to10.p6;

/**
 * @link https://leetcode.com/problems/zigzag-conversion/
 * @author guolanren
 */
public class ZigzagConversion {

    public String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0, position = 0, step = -1; i < s.length(); i++) {
            if (position + step < 0 || position + step > numRows - 1) {
                step = step * -1;
            }
            if (sbs[position] == null) {
                sbs[position] = new StringBuilder();
            }
            sbs[position].append(s.charAt(i));
            position = position + step;
        }
        StringBuilder result = new StringBuilder();
        for (StringBuilder sb : sbs) {
            if (sb != null) {
                result.append(sb);
            }
        }
        return result.toString();
    }

}
