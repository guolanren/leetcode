package name.guolanren._1to100._41to50.p45;

/**
 * @link https://leetcode.com/problems/jump-game-ii/
 * @author guolanren
 */
public class JumpGameII {

    public int jump(int[] nums) {
        int current = 0;
        int minJumps = 0;
        while (current < nums.length - 1) {
            if (current + nums[current] >= nums.length - 1) {
                return ++minJumps;
            }
            int maxValueIndex = current;
            for (int i = current + 1; i < nums.length && i <= current + nums[current]; i++) {
                if (i + nums[i] >= maxValueIndex + nums[maxValueIndex]) {
                    maxValueIndex = i;
                }
            }
            current = maxValueIndex;
            minJumps++;
        }
        return minJumps;
    }

}
