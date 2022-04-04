package name.guolanren._1to100._91to100.p95;

import java.util.ArrayList;
import java.util.List;

/**
 * @link https://leetcode.com/problems/unique-binary-search-trees-ii/
 * @author guolanren
 */
public class UniqueBinarySearchTrees2 {

    public List<TreeNode> generateTrees(int n) {
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int from, int to) {
        if (to < from) {
            List<TreeNode> bst = new ArrayList<>();
            bst.add(new TreeNode(0));
            return bst;
        }
        List<TreeNode> bsts = new ArrayList<>();
        for (int i = from; i <= to; i++) {
            List<TreeNode> leftChildBsts = generateTrees(from, i - 1);
            List<TreeNode> rightChildBsts = generateTrees(i + 1, to);

            for (TreeNode leftChildBst : leftChildBsts) {
                for (TreeNode rightChildBst : rightChildBsts) {
                    TreeNode root = new TreeNode(i);
                    if (leftChildBst.val != 0) {
                        root.left = leftChildBst;
                    }
                    if (rightChildBst.val != 0) {
                        root.right = rightChildBst;
                    }
                    bsts.add(root);
                }
            }
        }
        return bsts;
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
