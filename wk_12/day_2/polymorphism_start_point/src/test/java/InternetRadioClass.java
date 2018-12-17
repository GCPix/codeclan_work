import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InternetRadioClass {
    InternetRadio internetRadio;
    @Before
    public void setUp() throws Exception {
        internetRadio = new InternetRadio();
    }

    @Test
    public void canTune() {

        assertEquals("Currently tuned to: Classic FM", internetRadio.tune("Classic FM"));
    }
}
