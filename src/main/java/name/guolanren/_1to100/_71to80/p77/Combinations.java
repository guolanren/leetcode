package name.guolanren._1to100._71to80.p77;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/combinations/
 * @author guolanren
 */
public class Combinations {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res = new ArrayList<>();
        combine(1, n, k, new LinkedList<>(), res);
        return res;
    }

    private void combine(int start, int n, int k, LinkedList<Integer> list, List<List<Integer>> res) {
        if (list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = start; i <= n; i++) {
            list.add(i);
            combine(i + 1, n, k, list, res);
            list.removeLast();
        }
    }

}
