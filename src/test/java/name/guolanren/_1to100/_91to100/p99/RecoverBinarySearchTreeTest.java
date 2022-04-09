package name.guolanren._1to100._91to100.p99;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class RecoverBinarySearchTreeTest {

    private RecoverBinarySearchTree recoverBinarySearchTree;

    @Before
    public void before() {
        recoverBinarySearchTree = new RecoverBinarySearchTree();
    }

    @Test
    public void test() {
        TreeNode n2 = new TreeNode(2);
        TreeNode n3 = new TreeNode(3, null, n2);
        TreeNode n1 = new TreeNode(1, n3, null);
        recoverBinarySearchTree.recoverTree(n1);
    }

}