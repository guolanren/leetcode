package name.guolanren._1to100._51to60.p52;

import name.guolanren._1to100._51to60.p51.NQueens;
import org.junit.Test;

/**
 * @author guolanren
 */
public class NQueensTest {

    @Test
    public void test() {
        System.out.println(new NQueens2().totalNQueens(0));
        System.out.println(new NQueens2().totalNQueens(1));
        System.out.println(new NQueens2().totalNQueens(2));
        System.out.println(new NQueens2().totalNQueens(3));
        System.out.println(new NQueens2().totalNQueens(4));
        System.out.println(new NQueens2().totalNQueens(5));
    }
}