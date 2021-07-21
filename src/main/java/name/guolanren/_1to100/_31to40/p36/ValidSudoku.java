package name.guolanren._1to100._31to40.p36;

/**
 * @link https://leetcode.com/problems/valid-sudoku/
 * @author guolanren
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            int[] row = new int[9];
            int[] column = new int[9];
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int rowNum = Character.getNumericValue(board[i][j]);
                    if (row[rowNum - 1] == rowNum) {
                        return false;
                    } else {
                        row[rowNum - 1] = rowNum;
                    }
                }
                if (board[j][i] != '.') {
                    int columnNum = Character.getNumericValue(board[j][i]);
                    if (column[columnNum - 1] == columnNum) {
                        return false;
                    } else {
                        column[columnNum - 1] = columnNum;
                    }
                }
                if (i % 3 == 0 && j % 3 == 0) {
                    int[] subBox = new int[9];
                    for (int k = i; k < i + 3; k++) {
                        for (int l = j; l < j + 3; l++) {
                            if (board[k][l] != '.') {
                                int num = Character.getNumericValue(board[k][l]);
                                if (subBox[num - 1] == num) {
                                    return false;
                                } else {
                                    subBox[num - 1] = num;
                                }
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

}
