package name.guolanren._1to100._31to40.p34;

/**
 * @link https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
 * @author guolanren
 */
public class FindFirstAndLastPositionOfElementInSortedArray {

    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        int[] result = {-1, -1};
        int firstStart = 0;
        int firstEnd = nums.length - 1;
        int lastStart = 0;
        int lastEnd = nums.length - 1;

        while (firstStart < firstEnd) {
            int firstCutPoint = (firstStart + firstEnd) / 2;
            if (target < nums[firstCutPoint]) {
                firstEnd = firstCutPoint - 1;
            } else if (target > nums[firstCutPoint]){
                firstStart = firstCutPoint + 1;
            } else {
                firstEnd = firstCutPoint;
            }
        }

        while (lastStart < lastEnd) {
            int lastCutPoint = (lastStart + lastEnd + 1) / 2;
            if (target < nums[lastCutPoint]) {
                lastEnd = lastCutPoint - 1;
            } else if (target > nums[lastCutPoint]){
                lastStart = lastCutPoint + 1;
            } else {
                lastStart = lastCutPoint;
            }
        }

        if (firstStart < nums.length && target == nums[firstStart]) {
            result[0] = firstStart;
        }
        if (lastEnd < nums.length && target == nums[lastEnd]) {
            result[1] = lastEnd;
        }
        return result;
    }

}
