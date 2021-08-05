package name.guolanren._1to100._41to50.p47;

import java.util.*;

/**
 * @link https://leetcode.com/problems/permutations-ii/
 * @author guolanren
 */
public class PermutationsII {

    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums.length == 1) {
            List<Integer> result = new ArrayList<>();
            result.add(nums[0]);
            results.add(result);
        } else {
            List<List<Integer>> subResults = permuteUnique(Arrays.copyOfRange(nums, 1, nums.length));
            Set<String> unique = new HashSet<>();
            for (List<Integer> subResult : subResults) {
                for (int i = 0; i <= subResult.size(); i++) {
                    if (i == 0 || !subResult.get(i - 1).equals(nums[0])) {
                        List<Integer> result = new ArrayList<>(subResult);
                        result.add(i, nums[0]);
                        if (unique.add(result.toString())) {
                            results.add(result);
                        }
                    }
                }
            }
        }
        return results;
    }

}
