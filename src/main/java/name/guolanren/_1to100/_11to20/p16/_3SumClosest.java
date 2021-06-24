package name.guolanren._1to100._11to20.p16;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/3sum-closest/
 * @author guolanren
 */
public class _3SumClosest {

    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int diff = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length - 2; i++) {
            int low = i + 1;
            int high = nums.length - 1;
            while (low < high) {
                int _3sum = nums[i] + nums[low] + nums[high];
                if (Math.abs(target - _3sum) < Math.abs(diff)) {
                    diff = target - _3sum;
                }
                if (_3sum < target) {
                    low++;
                } else {
                    high--;
                }
            }
        }
        return target - diff;
    }

}
