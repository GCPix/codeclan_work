import Components.TapePlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TapePlayerTest {
    TapePlayer tapePlayer;
    @Before
    public void setUp() throws Exception {

        tapePlayer = new TapePlayer("Amstrad", "C100");

    }

    @Test
    public void hasMake() {

        assertEquals("Amstrad", tapePlayer.getMake());
    }

    @Test
    public void setMake() {
        tapePlayer.setMake("JVC");
        assertEquals("JVC", tapePlayer.getMake());

    }

    @Test
    public void hasModel() {
        assertEquals("C100", tapePlayer.getModel());
    }

    @Test
    public void canSetModel() {
        tapePlayer.setModel("H278");
        assertEquals("H278", tapePlayer.getModel());
    }

    @Test
    public void continuousPlayStartFalse() {
        assertFalse(tapePlayer.isContinuousPlay());
    }

    @Test
    public void continuousPlayTrue() {
        tapePlayer.setContinuousPlay(true);
        assertTrue(tapePlayer.isContinuousPlay());

    }

    @Test
    public void continuousPlayFalseAfterTrue() {
        tapePlayer.setContinuousPlay(true);
        tapePlayer.setContinuousPlay(false);
        assertFalse(tapePlayer.isContinuousPlay());
    }

    @Test
    public void canPlay() {
        assertEquals("I am playing through the tape deck", tapePlayer.play());
    }
}
