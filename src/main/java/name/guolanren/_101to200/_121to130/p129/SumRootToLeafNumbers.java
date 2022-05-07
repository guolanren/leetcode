package name.guolanren._101to200._121to130.p129;

/**
 * @link https://leetcode.com/problems/sum-root-to-leaf-numbers/
 * @author guolanren
 */
public class SumRootToLeafNumbers {

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return sumNumbers(root, 0);
    }

    private int sumNumbers(TreeNode root, int sum) {
        int newSum = sum * 10 + root.val;
        if (root.left != null && root.right != null) {
            return sumNumbers(root.left, newSum) + sumNumbers(root.right, newSum);
        } else if (root.left != null) {
            return sumNumbers(root.left, newSum);
        } else if (root.right != null) {
            return sumNumbers(root.right, newSum);
        } else {
            return Integer.valueOf(newSum);
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
