package name.guolanren._1to100._21to30.p27;

/**
 * @link https://leetcode.com/problems/remove-element/
 * @author guolanren
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {
        int leave = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[leave++] = nums[i];
            }
        }
        return leave;
    }

}
