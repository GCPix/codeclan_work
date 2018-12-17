import Behaviours.IStrategy;
import Strategies.Aggressive;
import Strategies.Defensive;
import Strategies.StrategyFactory;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StrategyFactoryTest {
    StrategyFactory factory;

    @Before
    public void setUp() throws Exception {
        factory = new StrategyFactory();
        IStrategy defensive = new Defensive();
    }

    @Test
    public void canGetStrategy() {
        String requested = "Aggressive";
        IStrategy strategy = factory.getStrategy(requested);
        assertEquals("I am making an aggressive move", factory.getStrategy("Aggressive"));
        assert(strategy instanceof Aggressive);
    }
}
