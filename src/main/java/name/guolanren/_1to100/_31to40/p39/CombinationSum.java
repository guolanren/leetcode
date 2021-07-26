package name.guolanren._1to100._31to40.p39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/combination-sum/
 * @author guolanren
 */
public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSumForSortedCandidates(candidates, target);
    }

    private List<List<Integer>> combinationSumForSortedCandidates(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            int nextTarget = target - candidates[i];
            if (nextTarget > 0) {
                List<List<Integer>> subResults = combinationSum(Arrays.copyOfRange(candidates, i, candidates.length), nextTarget);
                if (!subResults.isEmpty()) {
                    for (List<Integer> subResult : subResults) {
                        subResult.add(Integer.valueOf(candidates[i]));
                        results.add(subResult);
                    }
                }
            } else if (nextTarget == 0) {
                List<Integer> result = new ArrayList<>();
                result.add(candidates[i]);
                results.add(result);
            }
        }
        return results;
    }

}
