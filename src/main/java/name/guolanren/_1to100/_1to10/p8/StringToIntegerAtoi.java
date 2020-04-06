package name.guolanren._1to100._1to10.p8;

/**
 * @link https://leetcode.com/problems/string-to-integer-atoi/
 * @author guolanren
 */
public class StringToIntegerAtoi {

    public int myAtoi(String str) {
        int result = 0;
        // 符号, 1: + , -1: -，0: 未知
        int sign = 0;
        for (char c : str.toCharArray()) {
            // 在遇到符号位之前的空格全部跳过
            if (sign == 0 && ' ' == c) {
                continue;
            }
            if (sign == 0 && '-' == c) {
                sign = -1;
                continue;
            }
            if (sign == 0 && '+' == c) {
                sign = 1;
                continue;
            }
            // 第一个非空字符不是符号，则认为符号为 +
            sign = sign == 0 ? 1 : sign;
            // 非数字，直接返回
            if (c < '0' || '9' < c) {
                return result;
            } else {
                int tail = (c - '0') * sign;
                result = result * 10 + tail;
                // 是否溢出
                if (result  % 10 != tail) {
                    return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
            }
        }
        return result;
    }

}