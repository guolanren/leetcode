package name.guolanren._1to100._71to80.p80;

/**
 * @link https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/
 * @author guolanren
 */
public class RemoveDuplicatesFromSortedArray2 {

    public int removeDuplicates(int[] nums) {
        int curNum = nums[0];
        int write = 0;
        int read = 0;
        int k = 2;
        while (read < nums.length) {
            if (nums[read] == curNum) {
                if (k-- > 0) {
                    nums[write++] = nums[read];
                }
            } else {
                curNum = nums[read];
                nums[write++] = nums[read];
                k = 1;
            }
            read++;
        }
        return write;
    }

}
