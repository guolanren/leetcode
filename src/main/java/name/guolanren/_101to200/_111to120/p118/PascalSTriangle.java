package name.guolanren._101to200._111to120.p118;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/pascals-triangle/
 * @author guolanren
 */
public class PascalSTriangle {

    public List<List<Integer>> generate(int numRows) {
        if (numRows == 1) {
            List<List<Integer>> res = new ArrayList<>();
            List<Integer> row = Arrays.asList(1);
            res.add(row);
            return res;
        }

        List<List<Integer>> res = generate(numRows - 1);
        List<Integer> preRow = res.get(res.size() - 1);
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for (int i = 1; i < preRow.size(); i++) {
            row.add(preRow.get(i - 1) + preRow.get(i));
        }
        row.add(1);
        res.add(row);
        return res;
    }

}
