package name.guolanren._1to100._61to70.p62;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/unique-paths/
 * @author guolanren
 */
public class UniquePaths {

//    public int uniquePaths(int m, int n) {
//        int[][] dp = new int[m + 1][n + 1];
//
//        for (int i = 1; i <= m; i++) {
//            dp[i][1] = 1;
//        }
//        for (int i = 1; i <= n; i++) {
//            dp[1][i] = 1;
//        }
//
//        for (int i = 2; i <= m; i++) {
//            for (int j = 2; j <= n; j++) {
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//        }
//
//        return dp[m][n];
//    }


    public int uniquePaths(int m, int n) {
        int[] left = new int[n + 1];
        Arrays.fill(left, 1);
        int paths = 1;

        for (int i = 2; i <= m; i++) {
            int up = 1;
            for (int j = 2; j <= n; j++) {
                paths = left[j] + up;
                left[j] = paths;
                up = paths;
            }
        }

        return paths;
    }
}
