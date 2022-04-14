package name.guolanren._101to200._101to110.p105;

/**
 * @link https://leetcode.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/
 * @author guolanren
 */
public class ConstructBinaryTreeFromPreorderAndInorderTraversal {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    private TreeNode buildTree(int[] preorder, int preFrom, int preTo, int[] inorder, int inFrom, int inTo) {
        if (preTo - preFrom == 0 || preFrom >= preorder.length) {
            return null;
        }
        TreeNode parent = new TreeNode(preorder[preFrom]);

        int i = 0;
        while (i < inTo - inFrom) {
            if (inorder[inFrom + i] == parent.val) {
                break;
            }
            i++;
        }

        parent.left = buildTree(preorder, preFrom + 1, preFrom + 1 + i, inorder, inFrom, inFrom + i);
        parent.right = buildTree(preorder, preFrom + 1 + i, preTo, inorder, inFrom + i + 1, inTo);

        return parent;
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
