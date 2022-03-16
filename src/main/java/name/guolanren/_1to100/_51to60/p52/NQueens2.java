package name.guolanren._1to100._51to60.p52;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/n-queens-ii/
 * @author guolanren
 */
public class NQueens2 {

    int solutions = 0;

    public int totalNQueens(int n) {
        List<String> solution = new ArrayList<>();
        solve(solution, n);
        return solutions;
    }

    private void solve(List<String> solution, int n) {
        if (solution.size() == n) {
            solutions++;
            return;
        }
        for (int i = 0; i < n; i++) {
            if (conflict(solution, i)) {
                continue;
            }
            StringBuilder initRow = new StringBuilder(initRow(n));
            initRow.setCharAt(i, 'Q');
            String row = initRow.toString();
            solution.add(row);
            solve(solution, n);
            solution.remove(solution.size() - 1);
        }
    }

    private boolean conflict(List<String> checkerboard, int pos) {
        for (int i = 0; i < checkerboard.size(); i++) {
            String row = checkerboard.get(i);
            if ('Q' == row.charAt(pos)) {
                return true;
            }
            int offset = (checkerboard.size() - i);
            if (((pos - offset >= 0 && 'Q' == row.charAt(pos - offset)) || (pos + offset < row.length() && 'Q' == row.charAt(pos + offset)))) {
                return true;
            }
        }
        return false;
    }

    private String initRow(int n) {
        char[] row = new char[n];
        Arrays.fill(row, '.');
        return String.valueOf(row);
    }

}
