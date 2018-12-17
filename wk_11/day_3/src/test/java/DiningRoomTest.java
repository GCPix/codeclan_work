import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DiningRoomTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private DiningRoom diningRoom1;

    @Before
    public void setUp() throws Exception {
        guest1 = new Guest("Dana");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Danny");
        guest4 = new Guest("Azma");
        guest5 = new Guest("Anna");
        guest6 = new Guest("Leah");
        diningRoom1 = new DiningRoom("Green Room", 4);
    }

    @Test
    public void canCheckMaxCapacity(){
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest2);
        diningRoom1.addGuest(guest3);
        diningRoom1.addGuest(guest4);

        assertFalse(diningRoom1.checkMaxCapacity());
    }
    @Test
    public void canCheckMaxCapacity_notFull(){
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest2);


        assertTrue(diningRoom1.checkMaxCapacity());
    }

    @Test
    public void canAddGuest() {
        diningRoom1.addGuest(guest1);
        assertEquals(1, diningRoom1.guestCount());

    }

    @Test
    public void canRemoveAGuest() {
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest2);
        diningRoom1.removeGuest(guest2);
        assertTrue(diningRoom1.findGuest(guest1));
    }

    @Test
    public void canRemoveAllGuests() {
        diningRoom1.addGuest(guest1);
        diningRoom1.addGuest(guest2);
        diningRoom1.removeAllGuests();
        assertEquals(0, diningRoom1.guestCount());
    }


}
