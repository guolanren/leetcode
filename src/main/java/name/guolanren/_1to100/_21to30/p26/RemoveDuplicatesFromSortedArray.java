package name.guolanren._1to100._21to30.p26;

/**
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array/
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedArray {

    public int removeDuplicates(int[] nums) {
        int compareNum = nums.length > 0 ? nums[0] : Integer.MIN_VALUE;
        int insertFlag = 1;
        int leave = nums.length;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == compareNum) {
                leave--;
            } else {
                compareNum = nums[i];
                nums[insertFlag++] = nums[i];
            }
        }
        return leave;
    }

}
