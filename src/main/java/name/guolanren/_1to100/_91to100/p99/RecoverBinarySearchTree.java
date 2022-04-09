package name.guolanren._1to100._91to100.p99;

/**
 * @link https://leetcode.com/problems/recover-binary-search-tree/
 * @author guolanren
 */
public class RecoverBinarySearchTree {

    TreeNode swap1;
    TreeNode swap2;
    TreeNode previous;

    public void recoverTree(TreeNode root) {
        findSwaps(root);
        int temp = swap1.val;
        swap1.val = swap2.val;
        swap2.val = temp;
    }


    private void findSwaps(TreeNode root) {
        if (root == null) {
            return;
        }
        findSwaps(root.left);
        if (swap1 == null) {
            if (previous != null && previous.val > root.val) {
                swap1 = previous;
                swap2 = root;
            }
        } else {
            swap2 = swap2.val < root.val ? swap2 : root;
        }
        previous = root;
        findSwaps(root.right);
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