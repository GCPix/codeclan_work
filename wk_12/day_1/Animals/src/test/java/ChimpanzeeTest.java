import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ChimpanzeeTest {
    private Chimpanzee chimp;
    @Before
    public void setUp() throws Exception {
        chimp = new Chimpanzee("Chimpy");
    }

    @Test
    public void canWalk() {

        assertEquals("Chimpy is walking but not upright", chimp.walk());
    }
}
