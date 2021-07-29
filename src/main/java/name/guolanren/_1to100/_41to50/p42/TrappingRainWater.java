package name.guolanren._1to100._41to50.p42;

/**
 * @link https://leetcode.com/problems/trapping-rain-water/
 * @author guolanren
 */
public class TrappingRainWater {

    public int trap(int[] height) {
        int units = 0;
        int left = 0;
        int right = height.length - 1;
        int leftMax = 0;
        int rightMax = 0;
        while (right > left) {
            leftMax = Math.max(leftMax, height[left]);
            rightMax = Math.max(rightMax, height[right]);
            if (leftMax <= rightMax) {
                units = units + (leftMax - height[left]);
                left++;
            } else {
                units = units + (rightMax - height[right]);
                right--;
            }
        }
        return units;
    }

}
