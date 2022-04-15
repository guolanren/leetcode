package name.guolanren._101to200._101to110.p106;

/**
 * @link https://leetcode.com/problems/construct-binary-tree-from-inorder-and-postorder-traversal/
 * @author guolanren
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversal {

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return buildTree(inorder, 0, inorder.length, postorder, 0, postorder.length);
    }

    private TreeNode buildTree(int[] inorder, int inFrom, int inTo, int[] postorder, int postFrom, int postTo) {
        if (postFrom >= postTo)  {
             return null;
        }
        TreeNode parent = new TreeNode(postorder[postTo - 1]);
        int i = 0;
        while (i < inTo - inFrom) {
            if (inorder[inFrom + i] == parent.val) {
                break;
            }
            i++;
        }
        parent.left = buildTree(inorder, inFrom, inFrom + i, postorder, postFrom, postFrom + i);
        parent.right = buildTree(inorder, inFrom + i + 1, inTo, postorder, postFrom + i, postTo - 1);
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
