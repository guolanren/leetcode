package name.guolanren._1to100._81to90.p90;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/subsets-ii/
 * @author guolanren
 */
public class Subsets2 {

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<>();
        LinkedList<Integer> subset = new LinkedList<>();
        subset(nums, 0, subset, subsets);
        return subsets;
    }

    private void subset(int[] nums, int start, LinkedList<Integer> subset, List<List<Integer>> subsets) {
        subsets.add(new ArrayList(subset));

        int cur = start;
        while (cur < nums.length) {
            subset.addLast(nums[cur]);
            subset(nums, cur + 1, subset, subsets);
            subset.removeLast();

            do {
                cur++;
            } while (cur < nums.length && nums[cur - 1] == nums[cur]);
        }
    }

}
