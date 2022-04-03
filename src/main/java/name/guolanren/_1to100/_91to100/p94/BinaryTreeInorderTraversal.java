package name.guolanren._1to100._91to100.p94;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/binary-tree-inorder-traversal/
 * @author guolanren
 */
public class BinaryTreeInorderTraversal {

    List<Integer> order = new ArrayList<>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            order.add(root.val);
            inorderTraversal(root.right);
        }
        return order;
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
