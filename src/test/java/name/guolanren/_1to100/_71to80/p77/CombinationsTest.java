package name.guolanren._1to100._71to80.p77;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class CombinationsTest {

    private Combinations combinations;

    @Before
    public void before() {
        combinations = new Combinations();
    }

    @Test
    public void test() {
        System.out.println(combinations.combine(4, 2));
        System.out.println(combinations.combine(1, 1));
    }

}