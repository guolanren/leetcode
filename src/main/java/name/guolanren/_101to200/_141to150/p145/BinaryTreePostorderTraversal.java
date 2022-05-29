package name.guolanren._101to200._141to150.p145;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/binary-tree-postorder-traversal/
 * @author guolanren
 */
public class BinaryTreePostorderTraversal {

    List<Integer> order = new ArrayList<>();

    public List<Integer> postorderTraversal(TreeNode root) {
        traversal(root);
        return order;
    }

    private void traversal(TreeNode root) {
        if (root != null) {
            traversal(root.left);
            traversal(root.right);
            order.add(root.val);
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