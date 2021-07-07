package name.guolanren._1to100._21to30.p26;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedArrayTest {

    private RemoveDuplicatesFromSortedArray removeDuplicatesFromSortedArray;

    @Before
    public void before() {
        removeDuplicatesFromSortedArray = new RemoveDuplicatesFromSortedArray();
    }

    @Test
    public void test() {
        int[] input = {1, 1, 2};
        int leave = removeDuplicatesFromSortedArray.removeDuplicates(input);
        System.out.println(Arrays.toString(input));
        assertEquals(2, leave);

        int[] input2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int leave2 = removeDuplicatesFromSortedArray.removeDuplicates(input2);
        System.out.println(Arrays.toString(input2));
        assertEquals(5, leave2);
    }
}