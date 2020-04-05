package name.guolanren._1to100._1to10.p7;

/**
 * @link https://leetcode.com/problems/zigzag-conversion/
 * @author guolanren
 */
public class ReverseInteger {

    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            // 获取尾数(个位数)
            int tail = x % 10;
            result = result * 10 + tail;
            // 是否溢出
            if (result  % 10 != tail) {
                return 0;
            }
            x = x/10;
        }
        return result;
    }

}