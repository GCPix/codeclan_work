import java.util.ArrayList;

public class Conference {
    //create conferenceRoom class (name String, capacitySeatOnly int, capacityTables int,
    // currentGuests arrayList)
    private String name;
    private int capacitySeatsOnly;
    private int capacityTables;
    private ArrayList<Guest> guestList;
    private String currentUse;

    public Conference(String name, int capacitySeatsOnly, int capacityTables, String currentUse) {
        this.name = name;
        this.capacitySeatsOnly = capacitySeatsOnly;
        this.capacityTables = capacityTables;
        this.guestList = new ArrayList<Guest>();
        this.currentUse = currentUse;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacitySeatsOnly() {
        return capacitySeatsOnly;
    }

    public void setCapacitySeatsOnly(int capacitySeatsOnly) {
        this.capacitySeatsOnly = capacitySeatsOnly;
    }

    public int getCapacityTables() {
        return capacityTables;
    }

    public void setCapacityTables(int capacityTables) {
        this.capacityTables = capacityTables;
    }

    public int getNumberOfGuests() {
        return this.guestList.size();
    }

    public boolean checkMaxCapacity(){
        if (this.currentUse == "table"){
            return this.guestList.size() < this.capacityTables;
        }
        return this.guestList.size() < this.capacitySeatsOnly;
    }

    public void addGuest(Guest guest) {
        if (checkMaxCapacity()){
            this.guestList.add(guest);
        }
    }
    public void removeGuest(Guest guest) {
        this.guestList.remove(guest);
    }

    public void removeAllGuests() {
        this.guestList.clear();
    }
}
