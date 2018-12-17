import java.util.ArrayList;

public class Busstop {

//    Add a BusStop class which interacts with the other two.
//    BusStop should have a name and an initially empty ArrayList of type "Person" called Queue.
//    Add a method to add a Person to the queue.
//    Add a method to remove a person from the queue.
//    Create a pickUp method in bus that gets person from bus stop and adds to bus passengers.

    private String name;
    private ArrayList<Person> queue;
    private Person person;

    public Busstop(String name){
        this.name = name;
        this.queue = new ArrayList<Person>();
    }

    public int getQueueLength() {
       return this.queue.size();
    }

    public void add(Person person){
        this.queue.add(person);
    }

    public Person remove(){
         Person personRemoved = null;
        if (this.queue.size()>0) {
            personRemoved = this.queue.remove(0);

        }
        return personRemoved;
    }
}
