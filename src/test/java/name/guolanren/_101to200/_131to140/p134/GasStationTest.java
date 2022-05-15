package name.guolanren._101to200._131to140.p134;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * @author guolanren
 */
public class GasStationTest {

    private GasStation gasStation;

    @Before
    public void before() {
        gasStation = new GasStation();
    }

    @Test
    public void test() {
        int[] gas = new int[100000];
        int[] cost = new int[100000];
        gas[99999] = 2;
        cost[99998] = 1;
        Assert.assertEquals(99999, gasStation.canCompleteCircuit(gas, cost));
    }

}