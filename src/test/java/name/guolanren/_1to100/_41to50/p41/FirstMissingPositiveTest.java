package name.guolanren._1to100._41to50.p41;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class FirstMissingPositiveTest {

    private FirstMissingPositive firstMissingPositive;

    @Before
    public void before() {
        firstMissingPositive = new FirstMissingPositive();
    }

    @Test
    public void test() {
        assertEquals(3, firstMissingPositive.firstMissingPositive(new int[]{1, 2, 0}));
        assertEquals(2, firstMissingPositive.firstMissingPositive(new int[]{3, 4, -1, 1}));
        assertEquals(1, firstMissingPositive.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}