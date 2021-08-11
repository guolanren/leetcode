package name.guolanren._1to100._41to50.p46;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/permutations/
 * @author guolanren
 */
public class Permutations {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> result = new ArrayList<>();
            result.add(nums[0]);
            results.add(result);
        } else {
            List<List<Integer>> subResults = permute(Arrays.copyOfRange(nums, 1, nums.length));
            for (List<Integer> subResult : subResults) {
                for (int i = 0; i <= subResult.size(); i++) {
                    List<Integer> result = new ArrayList<>(subResult);
                    result.add(i, nums[0]);
                    results.add(result);
                }
            }
        }
        return results;
    }

}
