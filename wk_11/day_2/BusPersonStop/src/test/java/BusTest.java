import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;
    private Busstop busstop;

    @Before
    public void before(){
        bus = new Bus("Edinburgh", 15);
        person = new Person();
        busstop = new Busstop("Moliander");
        busstop.add(person);
    }

    @Test
    public void canGetNumberOfPassengersOnBus(){
        assertEquals(0, bus.numberOfPassengersOnBus());
    }

    @Test
    public void canAddPassenger(){
        bus.add(busstop);
        assertEquals(1, bus.numberOfPassengersOnBus());
        assertEquals(0, busstop.getQueueLength());
    }

    @Test
    public void canAddPassenger_failsCapacityFull(){
        for(int i=0; i<=15; i++){
            busstop.add(person);
            bus.add(busstop);
        }
        assertEquals(15, bus.numberOfPassengersOnBus());
    }

    @Test
    public void canRemovePassenger(){

        bus.add(busstop);
        bus.removePassenger(person);
        assertEquals(0, bus.numberOfPassengersOnBus());
    }

}
