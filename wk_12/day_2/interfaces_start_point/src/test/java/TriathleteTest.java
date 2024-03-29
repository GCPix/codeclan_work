
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TriathleteTest {

    Triathlete triathlete;

    @Before
    public void before() {
        triathlete = new Triathlete();
    }

    @Test
    public void hasDistanceAtBeginning() {
        assertEquals(0, triathlete.getDistanceTravelled());
    }

    @Test
    public void canGetDistanceRan() {
        triathlete.run(50);
        assertEquals(50, triathlete.getDistanceTravelled());
    }

    @Test
    public void canGetDistanceSwam() {
        triathlete.swim(20);
        assertEquals(20, triathlete.getDistanceTravelled());
    }

    @Test
    public void canGetDistanceCycled() {
        triathlete.cycle(10);
        assertEquals(10, triathlete.getDistanceTravelled());
    }

    @Test
    public void canGetTotalDistance() {
        triathlete.run(10);
        triathlete.swim(10);
        triathlete.cycle(10);
        assertEquals(30, triathlete.getDistanceTravelled());
    }


}