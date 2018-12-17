import java.util.ArrayList;

public class Hotel {
    //create Hotel class (name String, bedroomList ArrayList, conferenceRoom ArrayList, diningRoom arrayList)
    //hotel controls checkin/out method

    private String name;
    private ArrayList<Bedroom> bedroomList;
    private ArrayList<Conference> conferenceRoomList;
    private ArrayList<DiningRoom> diningRoomList;
    private ArrayList<Guest> roomGuestList;

    public Hotel(String name) {
        this.name = name;
        this.bedroomList = new ArrayList<Bedroom>();
        this.conferenceRoomList = new ArrayList<Conference>();
        this.diningRoomList = new ArrayList<DiningRoom>();
    }

    public int countBedrooms(){
        return this.bedroomList.size();
    }

    public int countConferenceRooms(){
        return this.conferenceRoomList.size();
    }
    public int countDiningRooms(){
        return this. diningRoomList.size();
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedroomList.add(bedroom);
    }

    public void addDiningRoom (DiningRoom diningRoom){
        this.diningRoomList.add(diningRoom);
    }

    public void addConferenceRoom(Conference conference){
        this.conferenceRoomList.add(conference);
    }

    public void addGuestToBedroom(Guest guest, Bedroom bedroom){

        bedroom.addGuest(guest);
    }

    public void removeGuestFromBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void removeAllGuestsFromBedroom(Bedroom bedroom) {
        bedroom.removeAllGuest();
    }

    public void addGuestToDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.addGuest(guest);
    }

    public void removeGuestFromDiningRoom(Guest guest, DiningRoom diningRoom) {
        diningRoom.removeGuest(guest);
    }
    public void removeAllGuestsFromDiningRoom(DiningRoom diningRoom) {
        diningRoom.removeAllGuests();
    }

    public Object bookBedroom(Bedroom bedroom, int noOfNights){
       Booking booking = new Booking(bedroom, noOfNights);
       return booking;
    }
}
