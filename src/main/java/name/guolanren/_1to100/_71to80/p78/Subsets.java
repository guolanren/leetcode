package name.guolanren._1to100._71to80.p78;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/subsets/
 * @author guolanren
 */
public class Subsets {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        subset(nums, 0, new LinkedList<>(), res);
        return res;
    }

    private void subset(int[] nums, int start, LinkedList<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));
        for (int i = start; i < nums.length; i++) {
            list.add(nums[i]);
            subset(nums, i + 1, list, res);
            list.removeLast();
        }
    }

}
