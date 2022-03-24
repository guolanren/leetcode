package name.guolanren._1to100._71to80.p78;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SubsetsTest {

    private Subsets subsets;

    @Before
    public void before() {
        subsets = new Subsets();
    }

    @Test
    public void test() {
        System.out.println(subsets.subsets(new int[]{1, 2, 3}));
        System.out.println(subsets.subsets(new int[]{1}));
    }

}