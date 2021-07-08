package name.guolanren._1to100._21to30.p27;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class RemoveElementTest {

    private RemoveElement removeElement;

    @Before
    public void before() {
        removeElement = new RemoveElement();
    }

    @Test
    public void test() {
        int[] input = {3, 2, 2, 3};
        int leave = removeElement.removeElement(input, 3);
        System.out.println(Arrays.toString(input));
        assertEquals(2, leave);

        int[] input2 = {0, 1, 2, 2, 3, 0, 4, 2};
        int leave2 = removeElement.removeElement(input2, 2);
        System.out.println(Arrays.toString(input2));
        assertEquals(5, leave2);
    }
}