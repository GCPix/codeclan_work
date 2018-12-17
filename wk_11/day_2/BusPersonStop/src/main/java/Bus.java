import java.util.ArrayList;

public class Bus {

//    Create a Bus class with a Destination, Capacity and an initially empty ArrayList passengers
//      of type Person
//    Create a method to return the number of passengers on the bus.
//    Create a method to add a passenger onto the bus only if the passenger count is less than the capacity.
//    Create a method to remove a passenger from the bus.

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;


    public Bus(String destination, int capacity){
        this.destination = destination;
        this.capacity=capacity;
        this.passengers = new ArrayList<Person>();
    }

    public int numberOfPassengersOnBus(){
        return this.passengers.size();
    }

    public void add(Busstop busstop){
        if (this.passengers.size()<this.capacity){
            Person person = busstop.remove();
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        if(this.passengers.size()>0){
            this.passengers.remove(person);
        }
    }
}
