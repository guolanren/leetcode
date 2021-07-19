package name.guolanren._1to100._31to40.p32;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/longest-valid-parentheses/
 * @author guolanren
 */
public class LongestValidParentheses {

    public int longestValidParentheses(String s) {
        int longest = 0;
        LinkedList<Integer> stack = new LinkedList<>();
        stack.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    longest = Math.max(longest, i - stack.peek());
                }
            } else {
                stack.push(i);
            }
        }
        return longest;
    }

}
