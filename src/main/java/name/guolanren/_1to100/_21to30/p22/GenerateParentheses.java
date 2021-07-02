package name.guolanren._1to100._21to30.p22;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/generate-parentheses/
 * @author guolanren
 */
public class GenerateParentheses {

    public List<String> generateParenthesis(int n) {
        return getResults(n, n);
    }

    private List<String> getResults(int left, int right) {
        List<String> results = new ArrayList<>();
        if (left == 0) {
            StringBuilder sb = new StringBuilder();
            while (right-- > 0) {
                sb.append(")");
            }
            results.add(sb.toString());
        } else if (left == right) {
            for (String subResult : getResults(left - 1, right)) {
                results.add("(" + subResult);
            }
        } else {
            for (String subResult : getResults(left - 1, right)) {
                results.add("(" + subResult);
            }
            for (String subResult : getResults(left, right - 1)) {
                results.add(")" + subResult);
            }
        }
        return results;
    }

}
