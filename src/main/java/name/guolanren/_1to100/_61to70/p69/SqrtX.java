package name.guolanren._1to100._61to70.p69;

/**
 * @link https://leetcode.com/problems/sqrtx/
 * @author guolanren
 */
public class SqrtX {

    public int mySqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int low = 0;
        int high = x;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (mid == 0 || mid < x / mid) {
                low = mid + 1;
            } else if (mid > x / mid) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return low - 1;
    }

}
