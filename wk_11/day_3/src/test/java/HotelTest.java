import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.theories.suppliers.TestedOn;

import static org.junit.Assert.assertEquals;

public class HotelTest {
    private Hotel hotel;
    private Guest guest1;
    private Guest guest2;
    private Guest guest3;
    private Guest guest4;
    private Guest guest5;
    private Guest guest6;
    private Conference conf1;
    private Conference conf2;
    private Bedroom bedroom1;
    private DiningRoom diningRoom;
    private Booking booking;

    @Before
    public void setUp(){
        hotel = new Hotel("Excelsior");
        conf1 = new Conference("Hall 1", 5,3,"table");
        conf2 = new Conference("Hall 2", 5,3,"chairs");
        bedroom1 = new Bedroom(101,2,"double", 5);
        diningRoom = new DiningRoom("Green Room", 4);
        guest1 = new Guest("Dana");
        guest2 = new Guest("Louise");
        guest3 = new Guest("Colin");
        hotel.addBedroom(bedroom1);


    }

    @Test
    public void addBedroom() {
        hotel.addBedroom(bedroom1);
        assertEquals(2, hotel.countBedrooms());
    }

    @Test
    public void addConferenceRoom() {
        hotel.addConferenceRoom(conf1);
        assertEquals(1, hotel.countConferenceRooms());
    }

    @Test
    public void addDiningRoom() {
        hotel.addDiningRoom(diningRoom);
        assertEquals(1, hotel.countDiningRooms());
    }

    @Test
    public void canAddGuestToBedroom() {
        hotel.addGuestToBedroom(guest1, bedroom1);
        assertEquals(1, bedroom1.getNoOfGuests());
    }

    @Test
    public void canRemoveGuestFromBedroom() {
        hotel.removeGuestFromBedroom(guest1, bedroom1);
        assertEquals(0, bedroom1.getNoOfGuests());
    }

    @Test
    public void CanRemoveGuestFromBedroom_guestNotThere() {
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.removeGuestFromBedroom(guest2, bedroom1);
        assertEquals(1, bedroom1.getNoOfGuests());
    }
    @Test
    public void canRemoveAllGuestsFromBedroom(){
        hotel.addGuestToBedroom(guest1, bedroom1);
        hotel.addGuestToBedroom(guest2, bedroom1);
        hotel.removeAllGuestsFromBedroom(bedroom1);
        assertEquals(0, bedroom1.getNoOfGuests());
    }

    @Test
    public void canAddGuestToDiningRoom() {
        hotel.addGuestToDiningRoom(guest1, diningRoom);
        assertEquals(1, diningRoom.guestCount());
    }

    @Test
    public void canRemoveGuestFromDiningRoom() {
        hotel.removeGuestFromDiningRoom(guest1, diningRoom);
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void canRemoveAllGuestsFromDiningRoom() {
        hotel.addGuestToDiningRoom(guest1,diningRoom);
        hotel.addGuestToDiningRoom(guest2,diningRoom);
        hotel.removeAllGuestsFromDiningRoom(diningRoom);
        assertEquals(0, diningRoom.guestCount());
    }

    @Test
    public void canReturnBooking() {

        assertEquals("Booking", hotel.bookBedroom(bedroom1, 5).getClass().getName());
    }


}
