package name.guolanren._1to100._31to40.p40;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class CombinationSumIITest {

    private CombinationSumII combinationSumII;

    @Before
    public void before() {
        combinationSumII = new CombinationSumII();
    }

    @Test
    public void test() {
        System.out.println(combinationSumII.combinationSum2(new int[]{10, 1, 2, 7, 6, 1, 5}, 8));
        System.out.println(combinationSumII.combinationSum2(new int[]{2, 5, 2, 1, 2}, 5));
    }
}