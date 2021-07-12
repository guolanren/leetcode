package name.guolanren._1to100._21to30.p29;

/**
 * @link https://leetcode.com/problems/divide-two-integers/
 * @author guolanren
 */
public class DivideTwoIntegers {

    public int divide(int dividend, int divisor) {
        if (divisor == Integer.MIN_VALUE) {
            if (dividend == Integer.MIN_VALUE) {
                return 1;
            } else {
                return 0;
            }
        }

        if (Math.abs(divisor) == 1) {
            if (dividend == Integer.MIN_VALUE) {
                return (dividend ^ divisor) < 0 ? dividend : Integer.MAX_VALUE;
            } else {
                return (dividend ^ divisor) < 0 ? -Math.abs(dividend) : Math.abs(dividend);
            }
        }

        int negativeDividend = -Math.abs(dividend);
        int negativeDivisor = -Math.abs(divisor);
        if (negativeDividend > negativeDivisor) {
            return 0;
        }
        int nDivisor = negativeDivisor * 1;
        int accumulate = negativeDivisor;
        int step = 1;
        int num = 1;
        while (step != 0) {
            if (accumulate + nDivisor < 0 &&accumulate + nDivisor >= negativeDividend) {
                num += step;
                accumulate += nDivisor;
                nDivisor += nDivisor;
                step += step;
            } else {
                if (nDivisor == negativeDivisor) {
                    break;
                }
                nDivisor = negativeDivisor * 1;
                step = 1;
            }
        }
        return (dividend ^ divisor) < 0 ? -num : num;
    }

}
