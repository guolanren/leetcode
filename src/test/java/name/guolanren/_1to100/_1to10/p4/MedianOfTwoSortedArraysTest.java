package name.guolanren._1to100._1to10.p4;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MedianOfTwoSortedArraysTest {

    private MedianOfTwoSortedArrays medianOfTwoSortedArrays;

    @Before
    public void before() {
        medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
    }

    @Test
    public void test1() {
        int[] num1 = {1, 3};
        int[] num2 = {2};
        assertEquals(2.0, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2), 0.001);
    }

    @Test
    public void test2() {
        int[] num1 = {1, 2};
        int[] num2 = {3, 4};
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2), 0.001);
    }

    @Test
    public void test3() {
        int[] num1 = {};
        int[] num2 = {1};
        assertEquals(1, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2), 0.001);
    }

    @Test
    public void test4() {
        int[] num1 = {};
        int[] num2 = {2,3};
        assertEquals(2.5, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2), 0.001);
    }

    @Test
    public void test5() {
        int[] num1 = {3};
        int[] num2 = {-2, -1};
        assertEquals(-1, medianOfTwoSortedArrays.findMedianSortedArrays(num1, num2), 0.001);
    }
}