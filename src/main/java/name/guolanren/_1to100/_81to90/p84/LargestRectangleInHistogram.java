package name.guolanren._1to100._81to90.p84;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/largest-rectangle-in-histogram/
 * @author guolanren
 */
public class LargestRectangleInHistogram {

    public int largestRectangleArea(int[] heights) {
        int[] heightsWithSentinel = new int[heights.length + 2];
        for (int i = 0; i < heights.length; i++) {
            heightsWithSentinel[i + 1] = heights[i];
        }
        heights = heightsWithSentinel;

        LinkedList<Integer> stack = new LinkedList<>();
        stack.addLast(0);
        int largest = 0;
        for (int i = 1; i < heights.length; i++) {
            while (heights[stack.peekLast()] > heights[i]) {
                Integer height = heights[stack.removeLast()];
                Integer width = i - stack.peekLast() - 1;
                largest = Math.max(largest, height * width);
            }
            stack.addLast(i);
        }
        return largest;
    }

}
