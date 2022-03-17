package name.guolanren._1to100._51to60.p54;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/spiral-matrix/
 * @author guolanren
 */
public class SpiralMatrix {

    public List<Integer> spiralOrder(int[][] matrix) {
        int x = 0;
        int y = 0;
        int xBorder = matrix.length;
        int yBorder = matrix[0].length;
        List<Integer> spiralOrder = new ArrayList<>(x * y);
        while (xBorder > 0 && yBorder > 0) {
            spiralOrder.add(matrix[x][y]);
            for (int i = 1; i < yBorder; i++) {
                spiralOrder.add(matrix[x][++y]);
            }
            for (int i = 1; i < xBorder; i++) {
                spiralOrder.add(matrix[++x][y]);
            }
            for (int i = 1; i < yBorder && xBorder > 1; i++) {
                spiralOrder.add(matrix[x][--y]);
            }
            for (int i = 1; i < xBorder - 1 && yBorder > 1; i++) {
                spiralOrder.add(matrix[--x][y]);
            }
            y++;
            xBorder -= 2;
            yBorder -= 2;
        }
        return spiralOrder;
    }

}
