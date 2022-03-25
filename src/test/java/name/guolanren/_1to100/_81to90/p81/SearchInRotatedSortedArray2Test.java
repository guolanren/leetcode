package name.guolanren._1to100._81to90.p81;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SearchInRotatedSortedArray2Test {


    private SearchInRotatedSortedArray2 searchInRotatedSortedArray2;

    @Before
    public void before() {
        searchInRotatedSortedArray2 = new SearchInRotatedSortedArray2();
    }

    @Test
    public void test() {
        Assert.assertTrue(searchInRotatedSortedArray2.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 0));
        Assert.assertFalse(searchInRotatedSortedArray2.search(new int[]{2, 5, 6, 0, 0, 1, 2}, 3));
        Assert.assertTrue(searchInRotatedSortedArray2.search(new int[]{1, 0, 1, 1, 1}, 0));
        Assert.assertTrue(searchInRotatedSortedArray2.search(new int[]{2, 2, 2, 3, 2, 2, 2}, 3));
        Assert.assertTrue(searchInRotatedSortedArray2.search(new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1}, 2));
    }

}