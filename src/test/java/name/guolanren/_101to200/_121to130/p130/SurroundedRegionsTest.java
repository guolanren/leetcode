package name.guolanren._101to200._121to130.p130;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class SurroundedRegionsTest {

    private SurroundedRegions surroundedRegions;

    @Before
    public void before() {
        surroundedRegions = new SurroundedRegions();
    }

    @Test
    public void test() {
        surroundedRegions.solve(new char[][]{{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}});
        surroundedRegions.solve(new char[][]{{'O','X','X','O','X'},{'X','O','O','X','O'},{'X','O','X','O','X'},{'O','X','O','O','O'},{'X','X','O','X','O'}});
        surroundedRegions.solve(new char[][]{{'O','O','O','O','X','X'},{'O','O','O','O','O','O'},{'O','X','O','X','O','O'},{'O','X','O','O','X','O'},{'O','X','O','X','O','O'},{'O','X','O','O','O','O'}});
        surroundedRegions.solve(new char[][]{{'X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},{'O','X','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O','X','X'},{'O','O','O','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','X'},{'O','O','X','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','X','O'},{'O','O','O','O','O','X','O','O','O','O','X','O','O','O','O','O','X','O','O','X'},{'X','O','O','O','X','O','O','O','O','O','X','O','X','O','X','O','X','O','X','O'},{'O','O','O','O','X','O','O','X','O','O','O','O','O','X','O','O','X','O','O','O'},{'X','O','O','O','X','X','X','O','X','O','O','O','O','X','X','O','X','O','O','O'},{'O','O','O','O','O','X','X','X','X','O','O','O','O','X','O','O','X','O','O','O'},{'X','O','O','O','O','X','O','O','O','O','O','O','X','X','O','O','X','O','O','X'},{'O','O','O','O','O','O','O','O','O','O','X','O','O','X','O','O','O','X','O','X'},{'O','O','O','O','X','O','X','O','O','X','X','O','O','O','O','O','X','O','O','O'},{'X','X','O','O','O','O','O','X','O','O','O','O','O','O','O','O','O','O','O','O'},{'O','X','O','X','O','O','O','X','O','X','O','O','O','X','O','X','O','X','O','O'},{'O','O','X','O','O','O','O','O','O','O','X','O','O','O','O','O','X','O','X','O'},{'X','X','O','O','O','O','O','O','O','O','X','O','X','X','O','O','O','X','O','O'},{'O','O','X','O','O','O','O','O','O','O','X','O','O','X','O','X','O','X','O','O'},{'O','O','O','X','O','O','O','O','O','X','X','X','O','O','X','O','O','O','X','O'},{'O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O','O'},{'X','O','O','O','O','X','O','O','O','X','X','O','O','X','O','X','O','X','O','O'}});
    }

}