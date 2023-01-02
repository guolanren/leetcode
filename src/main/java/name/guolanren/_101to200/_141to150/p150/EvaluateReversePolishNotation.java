package name.guolanren._101to200._141to150.p150;

import java.util.Stack;

/**
 * @link https://leetcode.com/problems/evaluate-reverse-polish-notation/
 * @author guoyaozhan
 */
public class EvaluateReversePolishNotation {

    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+": {
                    int n2 = Integer.parseInt(stack.pop());
                    int n1 = Integer.parseInt(stack.pop());
                    stack.push(n1 + n2 + "");
                    break;
                }
                case "-": {
                    int n2 = Integer.parseInt(stack.pop());
                    int n1 = Integer.parseInt(stack.pop());
                    stack.push(n1 - n2 + "");
                    break;
                }
                case "*": {
                    int n2 = Integer.parseInt(stack.pop());
                    int n1 = Integer.parseInt(stack.pop());
                    stack.push(n1 * n2 + "");
                    break;
                }
                case "/": {
                    int n2 = Integer.parseInt(stack.pop());
                    int n1 = Integer.parseInt(stack.pop());
                    stack.push(n1 / n2 + "");
                    break;
                }
                default:
                    stack.push(token);
            }
        }
        return Integer.parseInt(stack.pop());
    }

}
