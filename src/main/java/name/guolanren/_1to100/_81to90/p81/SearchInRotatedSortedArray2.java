package name.guolanren._1to100._81to90.p81;

/**
 * @link https://leetcode.com/problems/search-in-rotated-sorted-array-ii/
 * @author guolanren
 */
public class SearchInRotatedSortedArray2 {

    public boolean search(int[] nums, int target) {
        return rotatedSearch(nums, 0, nums.length - 1, target);
    }

    private boolean rotatedSearch(int[] nums, int from, int to, int target) {
        if (from >= to) {
            return nums[from] == target;
        }
        if (nums[from] < nums[to]) {
            return style1(nums, from, to, target);
        } else if (nums[from] == nums[to]) {
            return style2(nums, from, to, target);
        } else {
            return style3(nums, from, to, target);
        }
    }

    private boolean style1(int[] nums, int from, int to, int target) {
        while (from <= to) {
            int mid = (from + to) >>> 1;
            if (nums[mid] < target) {
                from = mid + 1;
            } else if (nums[mid] > target) {
                to = mid - 1;
            } else {
                return true;
            }
        }
        return false;
    }

    private boolean style2(int[] nums, int from, int to, int target) {
        int mid = (from + to) >>> 1;
        if (nums[mid] == target) {
            return true;
        } else if (nums[from] < target) {
            if (target < nums[mid]) {
                return rotatedSearch(nums, from, mid - 1, target);
            } else {
                return rotatedSearch(nums, mid + 1, to, target) || rotatedSearch(nums, from, mid - 1, target);
            }
        } else if (target < nums[to]) {
            if (target > nums[mid]) {
                return rotatedSearch(nums, mid + 1, to, target);
            } else {
                return rotatedSearch(nums, mid + 1, to, target) || rotatedSearch(nums, from, mid - 1, target);
            }
        } else {
            return true;
        }
    }

    private boolean style3(int[] nums, int from, int to, int target) {
        int mid = (from + to) >>> 1;
        if (nums[mid] == target) {
            return true;
        } else if (nums[from] < target) {
            if (target < nums[mid]) {
                return rotatedSearch(nums, from, mid - 1, target);
            } else {
                return rotatedSearch(nums, mid + 1, to, target) || rotatedSearch(nums, from, mid - 1, target);
            }
        } else if (target < nums[to]) {
            if (target > nums[mid]) {
                return rotatedSearch(nums, mid + 1, to, target);
            } else {
                return rotatedSearch(nums, mid + 1, to, target) || rotatedSearch(nums, from, mid - 1, target);
            }
        } else {
            return nums[from] == target || nums[to] == target;
        }
    }

}
