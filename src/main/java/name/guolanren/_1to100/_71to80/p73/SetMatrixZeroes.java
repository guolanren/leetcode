package name.guolanren._1to100._71to80.p73;

/**
 * @link https://leetcode.com/problems/set-matrix-zeroes/
 * @author guolanren
 */
public class SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[] zeroColumns = new int[m];
        int[] zeroRows = new int[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    zeroColumns[i] = 1;
                    zeroRows[j] = 1;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (zeroColumns[i] == 1) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < n; i++) {
            if (zeroRows[i] == 1) {
                for (int j = 0; j < m; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

}
