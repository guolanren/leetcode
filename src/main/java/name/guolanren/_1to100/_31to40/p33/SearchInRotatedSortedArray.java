package name.guolanren._1to100._31to40.p33;

import java.util.Arrays;

/**
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array/
 * @author guolanren
 */
public class SearchInRotatedSortedArray {

    public int search(int[] nums, int target) {
        return search(nums, target, 0);
    }

    private int search(int[] nums, int target, int offset) {
        if (nums.length == 0) {
            return -1 + offset;
        } else if (nums.length == 1) {
            return nums[0] == target ? 0 + offset : -1;
        }
        int cutPoint = (nums.length + 1) / 2;
        if ((nums[0] <= target && target <= nums[cutPoint - 1])
                || (nums[0] > nums[cutPoint - 1] && (nums[0] <= target || target <= nums[cutPoint - 1]))) {
            return search(Arrays.copyOfRange(nums, 0, cutPoint), target, offset);
        } else if (nums[cutPoint] <= target || target <= nums[nums.length - 1]) {
            return search(Arrays.copyOfRange(nums, cutPoint, nums.length), target, offset + cutPoint);
        }
        return -1;
    }

}
