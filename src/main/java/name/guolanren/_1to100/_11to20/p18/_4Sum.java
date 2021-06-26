package name.guolanren._1to100._11to20.p18;

import java.util.*;

/**
 * @link https://leetcode.com/problems/4sum/
 * @author guolanren
 */
public class _4Sum {

    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 3 && 4 * nums[i] <= target; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                break;
            }
            for (int j = i + 1; j < nums.length - 2 && nums[i] + 3 * nums[j] <= target; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                for (int k = j + 1; k < nums.length - 1 && nums[i] + nums[j] + 2 * nums[k] <= target; k++) {
                    if (k > j + 1 && nums[k] == nums[k - 1]) {
                        continue;
                    }
                    int fourth = target - (nums[i] + nums[j] + nums[k]);
                    Integer l = map.get(fourth);
                    if (l != null && l > k) {
                        result.add(Arrays.asList(nums[i], nums[j], nums[k], fourth));
                    }
                }
            }
        }
        return result;
    }

}
