package name.guolanren._1to100._51to60.p57;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class InsertIntervalTest {

    private InsertInterval insertInterval;

    @Before
    public void before() {
        insertInterval = new InsertInterval();
    }

    @Test
    public void test() {
        for (int[] each : insertInterval.insert(new int[][]{{1, 3}, {6, 9}}, new int[]{2, 5})) {
            System.out.println(Arrays.toString(each));
        }
        for (int[] each : insertInterval.insert(new int[][]{{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}}, new int[]{4, 8})) {
            System.out.println(Arrays.toString(each));
        }
    }

}