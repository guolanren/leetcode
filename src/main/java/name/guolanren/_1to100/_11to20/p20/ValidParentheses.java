package name.guolanren._1to100._11to20.p20;

import java.util.LinkedList;

/**
 * @link https://leetcode.com/problems/valid-parentheses/
 * @author guolanren
 */
public class ValidParentheses {

    public boolean isValid(String s) {
        LinkedList<Character> stack = new LinkedList<>();
        for (Character c : s.toCharArray()) {
            if (c.equals(')')) {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            } else if (c.equals(']')) {
                if (stack.isEmpty() || stack.pop() != '[') {
                    return false;
                }
            } else if (c.equals('}')) {
                if (stack.isEmpty() || stack.pop() != '{') {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }

}
