package name.guolanren._1to100._1to10.p1;

import java.util.HashMap;
import java.util.Map;

/**
 * @link https://leetcode.com/problems/two-sum/
 * @author guolanren
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {

        int[] indices = new int[2];
        Map<Integer, Integer> numsMap = new HashMap<>(nums.length);

        for (int i = 0; i < nums.length; i++) {
            int current = nums[i];
            int anotherLookFor =  target - current;
            Integer anotherIndex;

            // 如果待查找的数在 map 中有匹配，则表示找到符合要求的 indices
            if ((anotherIndex = numsMap.get(anotherLookFor)) != null) {
                indices[0] = anotherIndex;
                indices[1] = i;
            }

            numsMap.put(nums[i], i);
        }

        return indices;
    }

}
