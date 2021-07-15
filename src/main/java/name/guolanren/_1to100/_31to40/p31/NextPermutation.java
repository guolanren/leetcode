package name.guolanren._1to100._31to40.p31;

/**
 * @link https://leetcode.com/problems/next-permutation/
 * @author guoyaozhan
 */
public class NextPermutation {

    public void nextPermutation(int[] nums) {
        for (int i = nums.length - 1; i > 0 ; i--) {
            if (nums[i - 1] < nums[i]) {
                reserve(nums, i);
                for (int j = i; j < nums.length; j++) {
                    if (nums[i - 1] < nums[j]) {
                        int temp = nums[i - 1];
                        nums[i - 1] = nums[j];
                        nums[j] = temp;
                        break;
                    }
                }
                break;
            } else if (i - 1 == 0) {
                reserve(nums, 0);
            }
        }
    }

    private void reserve(int[] num, int from) {
        int length = num.length;
        for (int i = from; i < (length - 1 + from + 1) / 2; i++) {
            int temp = num[i];
            num[i] = num[length - 1 + from - i];
            num[length - 1 + from - i] = temp;
        }
    } 

}
