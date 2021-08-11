package name.guolanren._1to100._41to50.p47;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class PermutationsIITest {

    private PermutationsII permutationsII;

    @Before
    public void before() {
        permutationsII = new PermutationsII();
    }

    @Test
    public void test() {
        System.out.println(permutationsII.permuteUnique(new int[]{1, 1, 2}));
        System.out.println(permutationsII.permuteUnique(new int[]{1, 2, 3}));
        System.out.println(permutationsII.permuteUnique(new int[]{1, 1}));
    }
}