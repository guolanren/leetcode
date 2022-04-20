package name.guolanren._101to200._111to120.p112;

/**
 * @link https://leetcode.com/problems/path-sum/
 * @author guolanren
 */
public class PathSum {

    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        return has(root, targetSum);
    }

    private boolean has(TreeNode root, int targetSum) {
        if (root.left == null && root.right == null) {
            return targetSum == root.val;
        } else if (root.left == null) {
            return has(root.right, targetSum - root.val);
        } else if (root.right == null) {
            return has(root.left, targetSum - root.val);
        } else {
            return has(root.right, targetSum - root.val) || has(root.left, targetSum - root.val);
        }
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