package name.guolanren._101to200._121to130.p130;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @link https://leetcode.com/problems/surrounded-regions/
 * @author guolanren
 */
public class SurroundedRegions {

    public void solve(char[][] board) {
        List<Integer[]> oPoints = new ArrayList<>();
        for (int i = 1; i < board.length - 1; i++) {
            for (int j = 1; j < board[i].length - 1; j++) {
                if (board[i][j] == 'O') {
                    List<Integer[]> points = new ArrayList<>();
                    Queue<Integer[]> traverse = new LinkedList<>();
                    board[i][j] = 'X';
                    traverse.add(new Integer[]{i, j});
                    boolean turnO = false;
                    while (!traverse.isEmpty()) {
                        Integer[] point = traverse.poll();
                        int x = point[0];
                        int y = point[1];
                        points.add(point);
                        turnO = turnO || (x == 0 || y == 0 || x == board.length - 1 || y == board[x].length - 1);

                        if (x - 1 >= 0 && board[x - 1][y] == 'O') {
                            board[x - 1][y] = 'X';
                            traverse.offer(new Integer[]{x - 1, y});
                        }
                        if (x + 1 < board.length && board[x + 1][y] == 'O') {
                            board[x + 1][y] = 'X';
                            traverse.offer(new Integer[]{x + 1, y});
                        }
                        if (y - 1 >= 0 && board[x][y - 1] == 'O') {
                            board[x][y - 1] = 'X';
                            traverse.offer(new Integer[]{x, y - 1});
                        }
                        if (y + 1 < board[x].length && board[x][y + 1] == 'O') {
                            board[x][y + 1] = 'X';
                            traverse.offer(new Integer[]{x, y + 1});
                        }
                    }
                    if (turnO) {
                        oPoints.addAll(points);
                    }
                }
            }
            for (Integer[] point : oPoints) {
                int x = point[0];
                int y = point[1];
                board[x][y] = 'O';
            }
        }
    }

}
