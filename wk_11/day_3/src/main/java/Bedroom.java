import com.sun.xml.internal.bind.v2.TODO;

import java.util.ArrayList;

public class Bedroom {
    //create bedroom class (roomNumber int, capacity int, currentGuests arrayList, type string




    //guest would have to be able to check into multiple rooms

    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guestList;
    private String type;
    private float nightlyRate;

    public Bedroom(int roomNumber, int capacity, String type, float nightlyRate) {
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
        this.type = type;
        this.nightlyRate = nightlyRate;
    }

    public float getNightlyRate(){
        return this.nightlyRate;
    }


    public int getNoOfGuests() {
        return this.guestList.size();
    }
    public boolean checkMaxCapacity(){
        return this.guestList.size() < capacity;
    }

    public void addGuest(Guest guest) {
        if (checkMaxCapacity()) {
            this.guestList.add(guest);
        }
    }


    public void removeGuest(Guest guest) {
        if (this.guestList.contains(guest)) {
            this.guestList.remove(guest);
        }
    }

    public void removeAllGuest() {
        this.guestList.clear();
    }
}
