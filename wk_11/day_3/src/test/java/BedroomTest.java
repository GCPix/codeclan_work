import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Bedroom bedroom1;

    @Before

    public void setUp(){

      guest1 = new Guest("Dana");
      guest2 = new Guest("Peter");
      guest3 = new Guest("Jonathon");
      guest4 = new Guest("Evie");
      bedroom1 = new Bedroom(101, 2, "Single", 5);
    }

    @Test
    public void canGetCountOfGuests() {
        assertEquals(0, bedroom1.getNoOfGuests());
    }

    @Test

    public void canAddGuest() {
        bedroom1.addGuest(guest1);
        assertEquals(1, bedroom1.getNoOfGuests());

    }

    @Test
    public void canAddGuest_FailAllFull() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.addGuest(guest3);

        assertEquals(2, bedroom1.getNoOfGuests());

    }

    @Test
    public void canRemoveAGuest() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.removeGuest(guest2);
        assertEquals(1, bedroom1.getNoOfGuests());
    }

    @Test
    public void canRemoveAllGuests() {
        bedroom1.addGuest(guest1);
        bedroom1.addGuest(guest2);
        bedroom1.removeAllGuest();
        assertEquals(0, bedroom1.getNoOfGuests());
    }
}
