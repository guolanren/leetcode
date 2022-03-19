package name.guolanren._1to100._51to60.p60;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class PermutationSequenceTest {

    private PermutationSequence permutationSequence;

    @Before
    public void before() {
        permutationSequence = new PermutationSequence();
    }

    @Test
    public void test() {
        Assert.assertEquals("213", permutationSequence.getPermutation(3, 3));
        Assert.assertEquals("2314", permutationSequence.getPermutation(4, 9));
        Assert.assertEquals("123", permutationSequence.getPermutation(3, 1));
        Assert.assertEquals("132", permutationSequence.getPermutation(3, 2));
        Assert.assertEquals("312", permutationSequence.getPermutation(3, 5));
        Assert.assertEquals("1324", permutationSequence.getPermutation(4, 3));
        Assert.assertEquals("3412", permutationSequence.getPermutation(4, 17));
        Assert.assertEquals("1", permutationSequence.getPermutation(1, 1));
    }

}