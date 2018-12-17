import Behaviours.IConnect;

import java.util.*;

public class Network {
    private String name;
    private ArrayList<IConnect> devices;
    private int maxConnectionsAllowed;


    public Network(String name, int maxConnectionsAllowed){
        this.devices = new ArrayList<IConnect>();
        this.maxConnectionsAllowed = maxConnectionsAllowed;
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public int deviceCount(){
        return this.devices.size();

    }
    public int numberFreeConnectionsReached(){

        return this.maxConnectionsAllowed-this.devices.size();
    }

    public void connect(IConnect device){
        if(this.numberFreeConnectionsReached()>0) {
            this.devices.add(device);
        }
    }


    public void disconnectAll(){
        this.devices.clear();

    }

}