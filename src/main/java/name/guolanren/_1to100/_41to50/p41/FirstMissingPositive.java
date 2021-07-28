package name.guolanren._1to100._41to50.p41;

/**
 * @link https://leetcode.com/problems/first-missing-positive/
 * @author guolanren
 */
public class FirstMissingPositive {

    public int firstMissingPositive(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int replace = nums[i];
            while (replace - 1 >= 0 && replace - 1< nums.length && replace != nums[replace - 1]) {
                int temp = nums[replace - 1];
                nums[replace - 1] = replace;
                replace = temp;
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != i + 1) {
                return i + 1;
            }
        }
        return nums.length + 1;
    }

}
