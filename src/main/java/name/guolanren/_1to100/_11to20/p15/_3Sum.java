package name.guolanren._1to100._11to20.p15;

import java.util.*;

/**
 * @link https://leetcode.com/problems/3sum/
 * @author guolanren
 */
public class _3Sum {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        if (nums.length == 0 || nums[nums.length - 1] < 0) {
            return res;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] > 0) {
                break;
            }
            int j = i + 1;
            int k = nums.length - 1;
            int target = 0 - nums[i];

            while (j < k) {
                if (nums[j] + nums[k] < target) {
                    do {
                        j++;
                    } while (j < k && nums[j] == nums[j - 1]);
                } else if (nums[j] + nums[k] > target) {
                    do {
                        k--;
                    } while (j < k && nums[k] == nums[k + 1]);
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    do {
                        j++;
                    } while (j < k && nums[j] == nums[j - 1]);
                    do {
                        k--;
                    } while (j < k && nums[k] == nums[k + 1]);
                }
            }

        }
        return res;
    }

}
