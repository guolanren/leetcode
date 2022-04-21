package name.guolanren._101to200._111to120.p113;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * @author guolanren
 */
public class PathSum2 {

    List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return res;
        }
        findPathSum(root, targetSum, new LinkedList<>());
        return res;
    }

    private void findPathSum(TreeNode parent, int targetSum, LinkedList<Integer> path) {
        path.addLast(parent.val);
        if (parent.left == null && parent.right == null) {
            if (targetSum == parent.val) {
                res.add(new ArrayList<>(path));
            }

        } else {
            if (parent.left != null) {
                findPathSum(parent.left, targetSum - parent.val, path);
            }
            if (parent.right != null) {
                findPathSum(parent.right, targetSum - parent.val, path);
            }
        }
        path.removeLast();
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
