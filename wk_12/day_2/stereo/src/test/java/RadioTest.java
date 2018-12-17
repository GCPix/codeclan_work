import Components.Radio;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class RadioTest {
    Radio radio;

    @Before
    public void setUp() throws Exception {
        radio = new Radio("Denon", "D1023");
    }

    @Test
    public void hasMake() {

        assertEquals("Denon", radio.getMake());
    }

    @Test
    public void setMake() {
        radio.setMake("JVC");
        assertEquals("JVC", radio.getMake());

    }

    @Test
    public void hasModel() {
        assertEquals("D1023", radio.getModel());
    }

    @Test
    public void canSetModel() {
        radio.setModel("H278");
        assertEquals("H278", radio.getModel());
    }

    @Test
    public void canSetCurrentStation() {
        radio.setCurrentStation("Atlantic 252");
        assertEquals("Atlantic 252", radio.getCurrentStation());
    }

    @Test
    public void canPlay() {
        radio.setCurrentStation("Jazz.fm");
        assertEquals("This is playing through the radio, it is Jazz.fm station!", radio.play());
    }

    @Test
    public void canAddToPresetList() {
        radio.addStation("Atlantic 252");
        assertArrayEquals(new String[]{"Atlantic 252", null,null,null,null,null}, radio.getPresetStations());
    }
}
