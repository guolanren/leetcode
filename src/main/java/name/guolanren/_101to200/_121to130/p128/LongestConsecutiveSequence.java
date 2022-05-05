package name.guolanren._101to200._121to130.p128;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/longest-consecutive-sequence/
 * @author guolanren
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int longest = 1;
        int consecutive = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i]) {
                continue;
            } else if (nums[i - 1] + 1 == nums[i]) {
                consecutive++;
            } else {
                consecutive = 1;
            }
            longest = Math.max(longest, consecutive);
        }
        return longest;
    }

}
