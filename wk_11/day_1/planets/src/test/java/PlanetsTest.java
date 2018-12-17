import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlanetsTest {
    Planets planet;

    @Before
    public void before (){
        planet = new Planets("Mars", 5000000);
    }

    @Test
    public void hasName(){
        assertEquals("Mars", planet.getPlanetName());
    }
    @Test
    public void hasSize(){
        assertEquals(5000000, planet.getPlanetSize());
    }

}
