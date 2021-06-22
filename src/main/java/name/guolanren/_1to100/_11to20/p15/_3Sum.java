package name.guolanren._1to100._11to20.p15;

import java.util.*;

/**
 * @link https://leetcode.com/problems/3sum/
 * @author guolanren
 */
public class _3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        Map<Integer, Integer> map = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] > 0) {
                break;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < nums.length - 1; j++) {
                int _2Sum = nums[i] + nums[j];
                if (_2Sum > 0) {
                    break;
                }
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }
                Integer value = map.get(0 - _2Sum);
                if (value != null && j < value) {
                    result.add(Arrays.asList(nums[i], nums[j], nums[value]));
                }
            }
        }
        return result;
    }

}
