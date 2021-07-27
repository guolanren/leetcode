package name.guolanren._1to100._31to40.p40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @link https://leetcode.com/problems/combination-sum-ii/
 * @author guolanren
 */
public class CombinationSumII {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        return combinationSum2ForSortedCandidates(candidates, target);
    }

    public List<List<Integer>> combinationSum2ForSortedCandidates(int[] candidates, int target) {
        List<List<Integer>> results = new ArrayList<>();
        for (int i = 0; i < candidates.length; i++) {
            if (i > 0 && candidates[i] == candidates[i - 1]) {
                continue;
            }
            int nextTarget = target - candidates[i];
            if (nextTarget > 0) {
                List<List<Integer>> subResults =
                        combinationSum2ForSortedCandidates(Arrays.copyOfRange(candidates, i + 1, candidates.length), nextTarget);
                for (List<Integer> subResult : subResults) {
                    subResult.add(candidates[i]);
                    results.add(subResult);
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