package name.guolanren._1to100._31to40.p39;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class CombinationSumTest {

    private CombinationSum combinationSum;

    @Before
    public void before() {
        combinationSum = new CombinationSum();
    }

    @Test
    public void test() {
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println(combinationSum.combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println(combinationSum.combinationSum(new int[]{2}, 1));
        System.out.println(combinationSum.combinationSum(new int[]{1}, 1));
        System.out.println(combinationSum.combinationSum(new int[]{1}, 2));
    }
}