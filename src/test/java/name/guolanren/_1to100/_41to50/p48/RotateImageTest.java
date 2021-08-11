package name.guolanren._1to100._41to50.p48;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author guolanren
 */
public class RotateImageTest {

    private RotateImage rotateImage;

    @Before
    public void before() {
        rotateImage = new RotateImage();
    }

    @Test
    public void test() {
        int[][] matrix = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotateImage.rotate(matrix);
        System.out.println(Arrays.deepToString(matrix));

        int[][] matrix2 = new int[][]{{5, 1, 9, 11}, {2, 4, 8, 10}, {13, 3, 6, 7}, {15, 14, 12, 16}};
        rotateImage.rotate(matrix2);
        System.out.println(Arrays.deepToString(matrix2));
    }
}