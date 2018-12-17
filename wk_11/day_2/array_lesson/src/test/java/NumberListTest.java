import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberListTest {

    private NumberList myNumbers;

    @Before
    public void before(){
        myNumbers = new NumberList();
        this.myNumbers.add(2);
    }

    @Test
    public void hasNumberOfEntries(){
        assertEquals(1, myNumbers.getNumberCount());
    }

    @Test
    public void canAddToArrayList(){
        this.myNumbers.add(500);
        assertEquals(2, myNumbers.getNumberCount());
    }

    @Test
    public void canReadFromArrayList(){
        assertEquals(2, myNumbers.getFromIndex(0));
    }

    @Test
    public void canGetTotalClassic(){
        this.myNumbers.add(10);
        this.myNumbers.add(3);
        this.myNumbers.add(1);
        assertEquals(16, myNumbers.getTotalClassic());
    }

    @Test
    public void canGetTotalEnhanced(){
        this.myNumbers.add(10);
        this.myNumbers.add(3);
        this.myNumbers.add(1);
        assertEquals(16, myNumbers.getTotalEnhanced());
    }
}
