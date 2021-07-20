package name.guolanren._1to100._31to40.p35;

/**
 * @link https://leetcode.com/problems/search-insert-position/
 * @author guolanren
 */
public class SearchInsertPosition {

    public int searchInsert(int[] nums, int target) {
        int rangeLeft = 0;
        int rangeRight = nums.length;
        while (rangeLeft < rangeRight) {
            int cutPoint = (rangeLeft + rangeRight) / 2;
            if (target <= nums[cutPoint]) {
                rangeRight = cutPoint;
            } else{
                rangeLeft = cutPoint + 1;
            }
        }
        return rangeRight;
    }

}
