package name.guolanren._1to100._71to80.p75;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/sort-colors/
 * @author guolanren
 */
public class SortColors {

    public void sortColors(int[] nums) {
        int red = 0;
        int blue = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                red++;
            } else if (nums[i] == 2) {
                blue++;
            }
        }

        Arrays.fill(nums, 0, red, 0);
        Arrays.fill(nums, red, nums.length - blue, 1);
        Arrays.fill(nums, nums.length - blue, nums.length, 2);
    }

}
