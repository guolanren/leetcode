package name.guolanren._101to200._101to110.p106;

import org.junit.Before;
import org.junit.Test;

public class ConstructBinaryTreeFromInorderAndPostorderTraversalTest {

    private ConstructBinaryTreeFromInorderAndPostorderTraversal constructBinaryTreeFromPreorderAndInorderTraversal;

    @Before
    public void before() {
        constructBinaryTreeFromPreorderAndInorderTraversal = new ConstructBinaryTreeFromInorderAndPostorderTraversal();
    }

    @Test
    public void test() {
        constructBinaryTreeFromPreorderAndInorderTraversal.buildTree(new int[]{9, 3, 15, 20, 7}, new int[]{9, 15, 7, 20, 3});
    }


}