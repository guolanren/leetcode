package name.guolanren._1to100._31to40.p33;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author guolanren
 */
public class SearchInRotatedSortedArrayTest {

    private SearchInRotatedSortedArray searchInRotatedSortedArray;

    @Before
    public void before() {
        searchInRotatedSortedArray = new SearchInRotatedSortedArray();
    }

    @Test
    public void test() {
//        assertEquals(4, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
//        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
//        assertEquals(-1, searchInRotatedSortedArray.search(new int[]{1}, 0));
        assertEquals(0, searchInRotatedSortedArray.search(new int[]{5, 1, 3}, 5));
    }
}