package name.guolanren._1to100._81to90.p85;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/maximal-rectangle/
 * @author guolanren
 */
public class MaximalRectangle {

    public int maximalRectangle(char[][] matrix) {
        int[][] histograms = new int[matrix.length][matrix[0].length + 2];

        for (int j = 0; j < matrix[0].length; j++) {
            histograms[0][j + 1] = Character.getNumericValue(matrix[0][j]);
        }


        for (int i = 1; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                histograms[i][j + 1] = matrix[i][j] == '0' ? 0 : histograms[i - 1][j + 1] + 1;
            }
        }

        int maxArea = 0;
        for (int[] histogram : histograms) {
            LinkedList<Integer> stack = new LinkedList<>();
            stack.addLast(0);
            for (int i = 1; i < histogram.length; i++) {
                while (histogram[stack.peekLast()] > histogram[i]) {
                    int height = histogram[stack.removeLast()];
                    int width = i - stack.peekLast() - 1;
                    maxArea = Math.max(maxArea, height * width);
                }
                stack.addLast(i);
            }
        }
        return maxArea;
    }

}
