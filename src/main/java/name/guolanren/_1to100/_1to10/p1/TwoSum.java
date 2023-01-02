package name.guolanren._1to100._1to10.p1;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/two-sum/
 * @author guolanren
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> numsMap = new HashMap<>(length);
        Integer current;
        Integer lookFor;

        for (int i = 0; i < length; i++) {
            current = nums[i];

            // 如果待查找的数在 map 中有匹配，则表示找到符合要求的 indices
            if ((lookFor = numsMap.get(target - current)) != null) {
                return new int[]{lookFor, i};
            }

            numsMap.put(current, i);
        }

        return new int[]{-1, -1};
    }

}
