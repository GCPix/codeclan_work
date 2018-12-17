import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class RiverTest {
    private River river;
    private Salmon salmon;

    @Before
    public void before(){
        river = new River();
        salmon = new Salmon();
    }

    @Test
    public void canGetFishCount(){
        assertEquals(0, river.getFishCount());

    }

    @Test
    public void canAddFishToRiver(){
        river.add(salmon);
        assertEquals(1, river.getFishCount());
    }

    @Test
    public void canRemoveSalmonFromRiver(){
        river.add(salmon);
        river.removeFish();
        assertEquals(0, river.getFishCount());

    }
}
