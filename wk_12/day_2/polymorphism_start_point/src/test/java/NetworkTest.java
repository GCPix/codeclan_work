import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NetworkTest {

    Network network;
    Desktop desktop;
    Printer printer;
    InternetRadio internetRadio;

    @Before
    public void before() {
        network = new Network("CodeClan", 3);
        desktop = new Desktop("Keith's Desktop", "Apple", "Macbook Pro");
        printer = new Printer();
        internetRadio = new InternetRadio();
    }

    @Test
    public void canConnectPrinter() {
        network.connect(printer);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void hasName(){
        assertEquals("CodeClan", network.getName());
    }

    @Test
    public void deviceListStartsEmpty() {
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectDesktop() {
        network.connect(desktop);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void shouldEmptyDeviceListAfterDisconnectingAll() {
        network.connect(desktop);
        network.disconnectAll();
        assertEquals(0, network.deviceCount());
    }

    @Test
    public void canConnectInternetRadio() {
        network.connect(internetRadio);
        assertEquals(1, network.deviceCount());
    }

    @Test
    public void canAddMultipleTypesUsingInterface() {
        network.connect(internetRadio);
        network.connect(desktop);
        network.connect(printer);
        assertEquals(3, network.deviceCount());
    }

    @Test
    public void cannotAddMorethanMaxDevicesToNetwork() {
        network.connect(internetRadio);
        network.connect(desktop);
        network.connect(printer);
        network.connect(printer);
        assertEquals(3, network.deviceCount());
    }
}
