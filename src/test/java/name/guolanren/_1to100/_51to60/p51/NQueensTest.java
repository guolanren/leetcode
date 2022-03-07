package name.guolanren._1to100._51to60.p51;

import org.junit.Test;

/**
 * @author guolanren
 */
public class NQueensTest {

    @Test
    public void test() {
        System.out.println(new NQueens().solveNQueens(0));
        System.out.println(new NQueens().solveNQueens(1));
        System.out.println(new NQueens().solveNQueens(2));
        System.out.println(new NQueens().solveNQueens(3));
        System.out.println(new NQueens().solveNQueens(4));
        System.out.println(new NQueens().solveNQueens(5));
    }
}