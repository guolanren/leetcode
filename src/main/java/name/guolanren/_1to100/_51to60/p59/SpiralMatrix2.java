package name.guolanren._1to100._51to60.p59;

/**
 * @link https://leetcode.com/problems/spiral-matrix-ii/
 * @author guolanren
 */
public class SpiralMatrix2 {

    public int[][] generateMatrix(int n) {
        int[][] matrix = new int[n][n];
        int x = 0;
        int y = 0;
        int border = n;
        int counter = 1;

        while (border > 0) {
            matrix[x][y] = counter++;
            for (int i = 1; i < border; i++) {
                matrix[x][++y] = counter++;
            }
            for (int i = 1; i < border; i++) {
                matrix[++x][y] = counter++;
            }
            for (int i = 1; i < border && border > 1; i++) {
                matrix[x][--y] = counter++;
            }
            for (int i = 1; i < border - 1 && border > 1; i++) {
                matrix[--x][y] = counter++;
            }
            y++;
            border -= 2;
        }
        return matrix;
    }

}
