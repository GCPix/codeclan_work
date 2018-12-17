import Components.CDPlayer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {
    CDPlayer cdPlayer;

    @Before
    public void setUp() throws Exception {
        cdPlayer = new CDPlayer("JVC", "cd210", 3);
    }

    @Test
    public void hasMake() {

        assertEquals("JVC", cdPlayer.getMake());
    }

    @Test
    public void setMake() {
        cdPlayer.setMake("Amstrad");
        assertEquals("Amstrad", cdPlayer.getMake());

    }

    @Test
    public void hasModel() {
        assertEquals("cd210", cdPlayer.getModel());
    }

    @Test
    public void canSetModel() {
        cdPlayer.setModel("H221");
        assertEquals("H221", cdPlayer.getModel());
    }

    @Test
    public void hasNumberOfCDsAvailable() {
        assertEquals(3, cdPlayer.getNoOfCDsAvailable());
    }

    @Test
    public void canSetNumberOfCDsAvailable() {
        cdPlayer.setNoOfCDsAvailable(2);
        assertEquals(2, cdPlayer.getNoOfCDsAvailable());

    }

    @Test
    public void canShuffleAllSongs() {
        assertEquals("song Array shuffled", cdPlayer.shuffle());
    }

    @Test
    public void canPlay() {
        assertEquals("I am playing through the CD player", cdPlayer.play());
    }
}
