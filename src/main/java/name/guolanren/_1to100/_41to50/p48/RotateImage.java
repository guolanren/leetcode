package name.guolanren._1to100._41to50.p48;

/**
 * @link https://leetcode.com/problems/rotate-image/
 * @author guolanren
 */
public class RotateImage {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        for (int i = 0; i < n / 2; i++) {
            for (int j = i; j < n - i - 1; j++) {
                int replaceI = i;
                int replaceJ = j;
                int nextReplaceI = replaceJ;
                int nextReplaceJ = n - 1 - replaceI;
                int temp = matrix[replaceI][replaceJ];
                do {
                    replaceI = nextReplaceI;
                    replaceJ = nextReplaceJ;

                    int replace = temp;
                    temp = matrix[nextReplaceI][nextReplaceJ];
                    matrix[nextReplaceI][nextReplaceJ] = replace;

                    nextReplaceI = replaceJ;
                    nextReplaceJ = n - 1 - replaceI;
                } while (replaceI != i || replaceJ != j);
            }
        }
    }

}
