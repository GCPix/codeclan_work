import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MammalTest {
    private Mammal mammal;
    @Before
    public void setUp() throws Exception {
        mammal = new Mammal("giraffe");
    }

    @Test
    public void canTalk() {

        assertEquals("I can say any words I want like my words", mammal.talk("my words"));

    }
}
