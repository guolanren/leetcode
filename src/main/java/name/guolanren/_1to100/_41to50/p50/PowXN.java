package name.guolanren._1to100._41to50.p50;

import java.math.BigDecimal;

/**
 * @link https://leetcode.com/problems/powx-n/
 * @author guolanren
 */
public class PowXN {

    public double myPow(double x, int n) {
        double pow = pow(x, Math.abs(n));
        return n > 0 ? pow : 1 / pow;
    }

    private double pow(double x, int n) {
        if (n == 0) {
            return 1;
        } else if (n == 1) {
            return x;
        }
        double halfPow = pow(x, n / 2);
        if (n % 2 == 0) {
            return  halfPow * halfPow;
        } else {
            return halfPow * halfPow * x;
        }
    }

}
