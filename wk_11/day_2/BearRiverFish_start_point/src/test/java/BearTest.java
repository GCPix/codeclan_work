import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BearTest {

    private Bear bear;
    private Salmon salmon;
    private River river;

    @Before
    public void setUp() {
        bear = new Bear("Baloo");
        salmon = new Salmon();
        river = new River();
        river.add(salmon);
    }





    @Test
    public void bellyStartEmpty(){
        assertEquals(0, bear.foodCount());

    }
    @Test
    public void canEatSalmon(){
        bear.eatsSalmonFromRiver(river);
        assertEquals(1, bear.foodCount());
    }

    @Test
    public void bellyEmptiesWhenSleeping() {
        bear.eatsSalmonFromRiver(river);
        bear.sleeps();
        assertEquals(0, bear.foodCount());
    }
}


