package name.guolanren._101to200._131to140.p136;

/**
 * @link https://leetcode.com/problems/single-number/
 * @author guolanren
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int num : nums) {
            ret ^= num;
        }
        return ret;
    }

}
