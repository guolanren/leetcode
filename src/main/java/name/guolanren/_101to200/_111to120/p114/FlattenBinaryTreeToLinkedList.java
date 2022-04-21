package name.guolanren._101to200._111to120.p114;

/**
 * @link https://leetcode.com/problems/flatten-binary-tree-to-linked-list/
 * @author guolanren
 */
public class FlattenBinaryTreeToLinkedList {

    public void flatten(TreeNode root) {
        doFlatten(root);
    }

    public TreeNode doFlatten(TreeNode root) {
        if (root == null) {
            return null;
        }

        TreeNode left = root.left;
        TreeNode right = root.right;

        root.left = null;
        root.right = doFlatten(left);

        TreeNode cur = root;
        while (cur.right != null) {
            cur = cur.right;
        }

        cur.right = doFlatten(right);

        return root;
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