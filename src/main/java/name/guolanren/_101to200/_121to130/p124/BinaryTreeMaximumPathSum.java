package name.guolanren._101to200._121to130.p124;

/**
 * @link https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * @author guolanren
 */
public class BinaryTreeMaximumPathSum {

    int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        maxSum(root);
        return max;
    }

    private int maxSum(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMax = Math.max(0, maxSum(root.left));
        int rightMax = Math.max(0, maxSum(root.right));
        int sum = leftMax + rightMax + root.val;
        max = Math.max(max, sum);
        return Math.max(leftMax, rightMax) + root.val;
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
