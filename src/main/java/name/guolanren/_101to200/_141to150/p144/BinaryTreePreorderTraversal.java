package name.guolanren._101to200._141to150.p144;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/binary-tree-preorder-traversal/
 * @author guolanren
 */
public class BinaryTreePreorderTraversal {

    List<Integer> order = new ArrayList<>();

    public List<Integer> preorderTraversal(TreeNode root) {
        traversal(root);
        return order;
    }

    private void traversal(TreeNode root) {
        if (root != null) {
            order.add(root.val);
            traversal(root.left);
            traversal(root.right);
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
