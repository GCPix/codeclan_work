import Behaviours.IRun;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RunnerTest {

    Runner runner;

    @Before
    public void before() {
        runner = new Runner();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, runner.getDistanceTravelled());
    }

    @Test
    public void canRun() {
        runner.run(10);
        assertEquals(10, runner.getDistanceTravelled());
    }
    @Test
    public void canBeReferredToAsInterfaceType() {
        IRun somethingthatcanrun = new Runner();
        somethingthatcanrun.run(10);
        assertEquals(10, ((Runner) somethingthatcanrun).getDistanceTravelled());
    }
}