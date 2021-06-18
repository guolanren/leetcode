package name.guolanren._1to100._11to20.p13;

/**
 * @link https://leetcode.com/problems/roman-to-integer/
 * @author guolanren
 */
public class RomanToInteger {

    enum ROMAN {
        NONE(0),
        I(1),
        V(5),
        X(10),
        L(50),
        C(100),
        D(500),
        M(1000);

        int size;

        ROMAN(int size) {
            this.size = size;
        }

        public int getSize() {
            return size;
        }
    }

    public int romanToInt(String s) {
        int result = 0;
        int flag = 1;
        ROMAN right = ROMAN.NONE;
        for (int i = s.length() - 1; i >= 0 ; i--) {
            ROMAN current = ROMAN.valueOf(String.valueOf(s.charAt(i)));
            if (current.ordinal() < right.ordinal()) {
                flag = -1;
            } else if (current.ordinal() > right.ordinal()) {
                flag = 1;
            }
            result += flag * current.size;
            right = current;
        }
        return result;
    }

}
