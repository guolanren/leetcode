package name.guolanren._1to100._41to50.p46;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class PermutationsTest {

    private Permutations permutations;

    @Before
    public void before() {
        permutations = new Permutations();
    }

    @Test
    public void test() {
        System.out.println(permutations.permute(new int[]{1, 2, 3}));
        System.out.println(permutations.permute(new int[]{0, 1}));
        System.out.println(permutations.permute(new int[]{1}));
    }
}