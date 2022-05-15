package name.guolanren._101to200._131to140.p134;

/**
 * @link https://leetcode.com/problems/gas-station/
 * @author guolanren
 */
public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int i = 0;
        while (i < n) {
            int remaining = 0;
            int j;
            for (j = 0; j < n; j++) {
                int pos = i + j;
                pos = pos >= n ? pos - n : pos;
                remaining = remaining + gas[pos] - cost[pos];
                if (remaining < 0) {
                    break;
                }
            }

            if (j == n) {
                return i;
            }
            i = i + j + 1;
        }
        return -1;
    }

}
