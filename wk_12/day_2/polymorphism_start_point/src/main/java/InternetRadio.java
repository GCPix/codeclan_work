import Behaviours.IConnect;

public class InternetRadio implements IConnect {
    public String connect(String data) {
        return "connected to network: " + data;
    }
    // todo create an 'InternetRadio' class which implements the IConnect interface and be able to add an instance to
    // Network
//   todo         make the radio be able to tune to a station
//   todo         give the Network a maximum number of items that can be connected to it
//    todo         add a method to our Network to tell how many many free connection 'slots' there are.
//   todo  modify the connect() method in the Network class so that it will check if there are any free slots before a// device can connect.

    public String tune(String station){
        return "Currently tuned to: " + station;
    }


}
