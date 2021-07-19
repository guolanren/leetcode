package name.guolanren._1to100._31to40.p34;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class FindFirstAndLastPositionOfElementInSortedArrayTest {

    private FindFirstAndLastPositionOfElementInSortedArray findFirstAndLastPositionOfElementInSortedArray;

    @Before
    public void before()  {
        findFirstAndLastPositionOfElementInSortedArray = new FindFirstAndLastPositionOfElementInSortedArray();
    }

    @Test
    public void test () {
        assertArrayEquals(new int[]{3, 4}, findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6));
        assertArrayEquals(new int[]{-1, -1}, findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{}, 0));
        assertArrayEquals(new int[]{0, 1}, findFirstAndLastPositionOfElementInSortedArray.searchRange(new int[]{2, 2}, 2));
    }
}