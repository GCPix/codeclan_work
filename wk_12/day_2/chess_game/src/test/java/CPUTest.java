import Behaviours.IStrategy;
import Players.CPU;
import Strategies.Aggressive;
import Strategies.Defensive;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CPUTest {
    CPU cpu;

    @Before
    public void setUp() throws Exception {
        IStrategy aggressive = new Aggressive();
        cpu = new CPU(aggressive);
    }

    @Test
    public void canMakeMove() {
        String result = cpu.makeMove();
        assertEquals("I am making an aggressive move", result);

    }

    @Test
    public void canChangeStrategy() {
        IStrategy defensive = new Defensive();
        cpu.setStrategy(defensive);
        String result = cpu.makeMove();
        assertEquals("I am making a defensive move!", result);
    }
}
