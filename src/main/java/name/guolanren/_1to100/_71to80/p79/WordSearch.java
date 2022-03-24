package name.guolanren._1to100._71to80.p79;

/**
 * @link https://leetcode.com/problems/word-search/
 * @author guolanren
 */
public class WordSearch {

    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (wordSearch(i, j, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean wordSearch(int i, int j, char[][] board, String word, int match) {
        if (match == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length) {
            return false;
        }

        char waitForMatch = word.charAt(match);
        if (board[i][j] == waitForMatch) {
            board[i][j] = ' ';

            boolean res = wordSearch(i + 1, j, board, word, match + 1) ||
                    wordSearch(i - 1, j, board, word, match + 1) ||
                    wordSearch(i, j + 1, board, word, match + 1) ||
                    wordSearch(i, j - 1, board, word, match + 1);

            board[i][j] = waitForMatch;
            return res;
        }

        return false;
    }
}
