package name.guolanren._1to100._91to100.p98;

/**
 * @link https://leetcode.com/problems/validate-binary-search-tree/
 * @author guolanren
 */
public class ValidateBinarySearchTree {
    public boolean isValidBST(TreeNode root) {
        return isValidBST(root, null, null);
    }

    private boolean isValidBST(TreeNode root, Integer min, Integer max) {
        if (root.left != null && root.right != null) {
            return root.left.val < root.val && root.val < root.right.val
                    && (min == null || min < root.left.val)
                    && (max == null || root.right.val < max)
                    && isValidBST(root.left, min, root.val)
                    && isValidBST(root.right, root.val, max);
        } else if (root.left != null) {
            return root.left.val < root.val
                    && (min == null || min < root.left.val)
                    && isValidBST(root.left, min, root.val);
        } else if (root.right != null) {
            return root.val < root.right.val
                    && (max == null || root.right.val < max)
                    && isValidBST(root.right, root.val, max);
        } else {
            return true;
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