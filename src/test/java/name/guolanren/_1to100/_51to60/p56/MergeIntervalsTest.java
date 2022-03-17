package name.guolanren._1to100._51to60.p56;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class MergeIntervalsTest {

    private MergeIntervals mergeIntervals;

    @Before
    public void before() {
        mergeIntervals = new MergeIntervals();
    }

    @Test
    public void test() {
        for (int[] each : mergeIntervals.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})) {
            System.out.println(Arrays.toString(each));
        }
        for (int[] each : mergeIntervals.merge(new int[][]{{1, 4}, {4, 5}})) {
            System.out.println(Arrays.toString(each));
        }
    }

}