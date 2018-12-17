import java.util.ArrayList;

public abstract class Vehicle {

    private String model;
    private int numberOfWheels;
    private ArrayList<Vehicle> vehicles;

    public Vehicle(String model, int numberOfWheels) {
        this.model = model;
        this.numberOfWheels = numberOfWheels;
        this.vehicles = new ArrayList<Vehicle>();
    }

    public String drivingInstructions(){
        return "Turn the key to start.";
    }

    public ArrayList<Vehicle> getVehicleList() {
        return model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String startEngine() {
        return "Vrrr. Engine is running.";
    }


    public abstract String boardingInstructions();

    public ArrayList<Vehicle> getCars(Vehicle vehicleType) {
        ArrayList<Vehicle> specificVehicles = new ArrayList<Vehicle>();

        for (Vehicle v : vehicles) {
            if (v instanceof vehicleType) {
                specificVehicles.add(v);

            }
        }
    }
}
