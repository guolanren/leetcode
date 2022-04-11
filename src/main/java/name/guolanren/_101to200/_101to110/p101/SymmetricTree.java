package name.guolanren._101to200._101to110.p101;

/**
 * @link https://leetcode.com/problems/symmetric-tree/
 * @author guolanren
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }

        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode left, TreeNode right) {
        if (left != null && right != null) {
            return left.val == right.val && isSame(left.left, right.right) && isSame(left.right, right.left);
        }
        if (left == null && right == null) {
            return true;
        } else {
            return false;
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
