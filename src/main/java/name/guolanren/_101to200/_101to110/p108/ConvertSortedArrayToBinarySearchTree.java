package name.guolanren._101to200._101to110.p108;

/**
 * @link https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * @author guolanren
 */
public class ConvertSortedArrayToBinarySearchTree {

    public TreeNode sortedArrayToBST(int[] nums) {
        return sortedArrayToBST(nums, 0, nums.length - 1);
    }

    private TreeNode sortedArrayToBST(int[] nums, int from, int to) {
        if (to < from) {
            return null;
        }
        int mid = (from + to + 1) >>> 1;
        TreeNode parent = new TreeNode(nums[mid]);
        parent.left = sortedArrayToBST(nums, from, mid - 1);
        parent.right = sortedArrayToBST(nums, mid + 1, to);
        return parent;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
