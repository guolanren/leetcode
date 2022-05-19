package name.guolanren._101to200._131to140.p137;

/**
 * @link https://leetcode.com/problems/single-number-ii/
 * @author guolanren
 */
public class SingleNumber2 {

    public int singleNumber(int[] nums) {
        int ret = 0;
        for (int i = 0; i < 32; i++) {
            int bit = 0;
            for (int num : nums) {
                bit += (num & (1 << i)) >> i;
            }
            ret += (bit % 3) << i;
        }
        return ret;
    }

}
