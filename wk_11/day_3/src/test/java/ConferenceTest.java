import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceTest {
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private Conference conf1;
    private Conference conf2;

    @Before
    public void setUp() {
        guest1 = new Guest("Dana");
        guest2 = new Guest("Paul");
        guest3 = new Guest("Danny");
        guest4 = new Guest("Azma");
        guest5 = new Guest("Anna");
        guest6 = new Guest("Leah");
        conf1 = new Conference("Main Hall", 5, 3, "table");
        conf2 = new Conference("Main Hall", 5,3,"chair");
    }

    @Test
    public void canGetGuestCount(){
        assertEquals(0, conf1.getNumberOfGuests());
    }
    @Test
    public void addGuest_table() {
        conf1.addGuest(guest1);
        assertEquals(1,conf1.getNumberOfGuests());

    }

    @Test
    public void addGuest_table_FailRoomFull() {
        conf1.addGuest(guest1);
        conf1.addGuest(guest2);
        conf1.addGuest(guest3);
        conf1.addGuest(guest4);
        conf1.addGuest(guest5);
        conf1.addGuest(guest6);
        assertEquals(3,conf1.getNumberOfGuests());

    }
    @Test
    public void addGuest_chairs() {
        conf2.addGuest(guest1);
        assertEquals(1,conf2.getNumberOfGuests());

    }

    @Test
    public void addGuest_chairs_FailRoomFull() {
        conf2.addGuest(guest1);
        conf2.addGuest(guest2);
        conf2.addGuest(guest3);
        conf2.addGuest(guest4);
        conf2.addGuest(guest5);
        conf2.addGuest(guest6);
        assertEquals(5,conf2.getNumberOfGuests());

    }

    @Test
    public void canRemoveGuest() {
        conf2.addGuest(guest1);
        conf2.addGuest(guest2);
        conf2.addGuest(guest3);
        conf2.removeGuest(guest1);
        assertEquals(2, conf2.getNumberOfGuests());
    }

    @Test
    public void canRemoveAllGuests() {
        conf2.addGuest(guest1);
        conf2.addGuest(guest2);
        conf2.addGuest(guest3);
        conf2.removeAllGuests();
        assertEquals(0, conf2.getNumberOfGuests());
    }
}
