import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusstopTest {
    private Busstop busstop;
    private Person person;
    @Before
    public void before(){
        busstop = new Busstop("Cassandra");

    }

    @Test
    public void canGetSizeOfQueue(){
        assertEquals(0, busstop.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue(){
        busstop.add(person);
        assertEquals(1, busstop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue(){
        busstop.add(person);
        busstop.remove();
        assertEquals(0, busstop.getQueueLength());
    }

    @Test
    public void removePersonQueueEmpty(){
        busstop.remove();
        assertEquals(0, busstop.getQueueLength());
    }
}
