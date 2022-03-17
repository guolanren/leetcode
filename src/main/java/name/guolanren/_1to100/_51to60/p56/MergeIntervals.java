package name.guolanren._1to100._51to60.p56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @link https://leetcode.com/problems/merge-intervals/
 * @author guolanren
 */
public class MergeIntervals {

    public int[][] merge(int[][] intervals) {
        if (intervals.length == 1) {
            return intervals;
        }
        List<int[]> mergeIntervals = new ArrayList<>();
        Arrays.sort(intervals, Comparator.comparing(num -> num[0]));
        int[] waitForMerge = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            if (waitForMerge[1] >= intervals[i][1]) {
                continue;
            } else if (waitForMerge[1] < intervals[i][0]) {
                mergeIntervals.add(waitForMerge);
                waitForMerge = intervals[i];
            } else {
                waitForMerge[1] = intervals[i][1];
            }
        }
        mergeIntervals.add(waitForMerge);
        int[][] res = new int[mergeIntervals.size()][2];
        return mergeIntervals.toArray(res);
    }

}
