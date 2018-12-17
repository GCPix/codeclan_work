import java.util.ArrayList;

public class DiningRoom {
    //create diningRoom class (name String, capacity int, currentGuests arrayList)
    private String name;
    private int capacity;
    private ArrayList<Guest> guestList;

    public DiningRoom(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.guestList = new ArrayList<Guest>();
    }


    public int guestCount() {
        return this.guestList.size();
    }

    public boolean checkMaxCapacity(){
        return this.capacity>this.guestList.size();
    }
    public void addGuest(Guest guest) {
        if(checkMaxCapacity()) {
            this.guestList.add(guest);
        }
    }

    public void removeGuest(Guest guest) {
        this.guestList.remove(guest);
    }

    public boolean findGuest(Guest guest) {
        return this.guestList.contains(guest);
    }

    public void removeAllGuests() {
        this.guestList.clear();
    }
}
