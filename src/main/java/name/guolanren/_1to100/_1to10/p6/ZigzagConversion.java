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
        // 记录每个层级存放的字符串
        StringBuilder[] sbs = new StringBuilder[numRows];
        for (int i = 0, position = 0, step = -1; i < s.length(); i++) {
            // 遇到拐点，转变方向
            if (position + step < 0 || position + step > numRows - 1) {
                step = step * -1;
            }
            // 初始字符串
            if (sbs[position] == null) {
                sbs[position] = new StringBuilder();
            }
            sbs[position].append(s.charAt(i));
            // 计算下一个添加字符的位置
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
