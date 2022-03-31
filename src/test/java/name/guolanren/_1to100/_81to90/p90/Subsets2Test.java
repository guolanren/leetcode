package name.guolanren._1to100._81to90.p90;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class Subsets2Test {

    private Subsets2 subsets2;

    @Before
    public void before() {
        subsets2 = new Subsets2();
    }

    @Test
    public void test() {
        System.out.println(subsets2.subsetsWithDup(new int[]{1, 2, 2}));
        System.out.println(subsets2.subsetsWithDup(new int[]{0}));
    }

}