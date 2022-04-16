package name.guolanren._101to200._101to110.p107;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/binary-tree-level-order-traversal-ii/
 * @author guolanren
 */
public class BinaryTreeLevelOrderTraversal2 {

    LinkedList<List<Integer>> res = new LinkedList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return res;
        }
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        levelOrderBottom(queue);
        return res;
    }

    private void levelOrderBottom(LinkedList<TreeNode> queue) {
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                level.add(node.val);
                if (node.left != null) {
                    queue.offer(node.left);
                }
                if (node.right != null) {
                    queue.offer(node.right);
                }
            }
            res.addFirst(level);
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
