package name.guolanren._1to100._51to60.p55;

/**
 * @link https://leetcode.com/problems/jump-game/
 * @author guolanren
 */
public class JumpGame {

    public boolean canJump(int[] nums) {
        int maxJump = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxJump = Math.max(maxJump, i + nums[i]);
            if (maxJump <= i) {
                return false;
            }
        }
        return maxJump >= nums.length - 1;
    }

}
