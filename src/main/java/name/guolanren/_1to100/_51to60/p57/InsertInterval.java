package name.guolanren._1to100._51to60.p57;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @link https://leetcode.com/problems/insert-interval/
 * @author guolanren
 */
public class InsertInterval {

    public int[][] insert(int[][] intervals, int[] newInterval) {
        int[][] insertInterval = Arrays.copyOf(intervals, intervals.length + 1);
        insertInterval[insertInterval.length - 1] = newInterval;
        Arrays.sort(insertInterval, Comparator.comparing(interval -> interval[0]));

        List<int[]> resList = new ArrayList<>();
        int[] waitForMerge = insertInterval[0];
        for (int i = 1; i < insertInterval.length; i++) {
            if (waitForMerge[1] >= insertInterval[i][1]) {
                continue;
            } else if (waitForMerge[1] < insertInterval[i][0]) {
                resList.add(waitForMerge);
                waitForMerge = insertInterval[i];
            } else {
                waitForMerge[1] = insertInterval[i][1];
            }
        }
        resList.add(waitForMerge);
        int[][] res = new int[resList.size()][2];
        return resList.toArray(res);
    }

}
