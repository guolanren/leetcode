package name.guolanren._101to200._111to120.p119;

import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/pascals-triangle-ii/
 * @author guolanren
 */
public class PascalSTriangle2 {

    public List<Integer> getRow(int rowIndex) {
        LinkedList<Integer> row = new LinkedList<>();
        row.add(1);

        while (rowIndex-- > 0) {
            for (int i = row.size() - 2; i >= 0; i--) {
                row.set(i + 1, row.get(i) + row.get(i + 1));
            }
            row.addLast(1);
        }
        return row;
    }

}
