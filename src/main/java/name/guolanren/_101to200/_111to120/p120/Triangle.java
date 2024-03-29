package name.guolanren._101to200._111to120.p120;

import java.util.List;

/**
 * @author guolanren
 */
public class Triangle {

    public int minimumTotal(List<List<Integer>> triangle) {
        for (int i = triangle.size() - 2; i >= 0; i--) {
            List<Integer> row = triangle.get(i);
            List<Integer> next = triangle.get(i + 1);
            for (int j = 0; j < row.size(); j++) {
                row.set(j, row.get(j) + Math.min(next.get(j), next.get(j + 1)));
            }
        }
        return triangle.get(0).get(0);
    }

}
