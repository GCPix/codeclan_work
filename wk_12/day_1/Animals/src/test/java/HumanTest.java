import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HumanTest {
    private Human human;

    @Before
    public void setUp() throws Exception {
        human = new Human("Gillian");
    }

    @Test
    public void canWalk() {
        assertEquals("Gillian is walking upright", human.walk());

    }
}
