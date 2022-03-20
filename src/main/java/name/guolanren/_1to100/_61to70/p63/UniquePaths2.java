package name.guolanren._1to100._61to70.p63;

/**
 * @link https://leetcode.com/problems/unique-paths-ii/submissions/
 * @author guolanren
 */
public class UniquePaths2 {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid[0].length;
        int n = obstacleGrid.length;

        int[] left = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            if (obstacleGrid[i - 1][0] == 1) {
                break;
            }
            left[i] = 1;
        }

        int upObstacleIndex = m;
        for (int i = 0; i < m; i++) {
            if (obstacleGrid[0][i] == 1) {
                upObstacleIndex = i;
                break;
            }
        }

        if (m == 1) {
            return left[n];
        } else if (n == 1) {
            return m > upObstacleIndex ? 0 : 1;
        }

        int paths = 0;
        for (int i = 2; i <= m; i++) {
            int up = i > upObstacleIndex ? 0 : 1;
            for (int j = 2; j <= n; j++) {
                if (obstacleGrid[j - 1][i - 1] == 1) {
                    paths = 0;
                } else {
                    paths = left[j] + up;
                }
                left[j] = paths;
                up = paths;
            }
        }

        return paths;
    }
}
