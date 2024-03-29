import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class VehicleTest {
    Vehicle vehicle;
//
//    @Before
//    public void before() {
//
//
//    }
//
//    @Test
//    public void vehicleHasNumberOfWheels() {
//        assertEquals(4, vehicle.getNumberOfWheels());
//    }
//
//    @Test
//    public void vehicleHasModel() {
//        assertEquals("Ford Escort", vehicle.getModel());
//    }
//
//    @Test
//    public void hasDrivingInstructions() {
//        assertEquals("Turn the key to start.", vehicle.drivingInstructions());
//    }
//
//    //BELOW: Inheritance related tests:
//
    @Test
    public void carAsVehicle() {
        vehicle = new Car("Audi A8", 2);
        assertEquals("Audi A8", vehicle.getModel());
    }

    @Test
    public void motorbikeAsVehicle() {
        vehicle = new Motorbike("Harley");
        assertEquals("Harley", vehicle.getModel());
    }

    @Test
    public void changeTypeOfVehicle() {
        vehicle = new Car("Audi A8", 2);
        vehicle = new Motorbike("Harley");
        assertEquals("Harley", vehicle.getModel());
    }

    @Test
    public void collectionOfParentClassObjects() {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
        garage.add( new Car("Audi A8", 2));
        garage.add( new Motorbike("Harley"));
//        garage.add( new Vehicle("Mini Morris", 4)); //note: this won't work with abstract classes
        assertEquals(2, garage.size());
    }

    @Test
    public void objectRemembersItsType() {
        vehicle = new Car("Audi A8", 2);
        Car car  = (Car) vehicle; // Example of type casting Vehicle to Car
        assertEquals(2, car.getNumberOfDoors());

        //todo look into looping over an array at superclass level to find method at subclass level ie trying to use

        //todo figure out why casting would be required
    }


    @Test
    public void hasCars() {
        ArrayList<Vehicle> garage = new ArrayList<Vehicle>();
        ArrayList<String> cars = new ArrayList<String>();
        garage.add( new Car("Audi A8", 2));
        garage.add( new Motorbike("Harley"));
        garage.add(new Car("Ford Focus", 5));
            for (Vehicle v : garage) {
                if (v instanceof Car) {
                    cars.add(v.getModel());

                }
            }
            assertArrayEquals(String ["Audi A8", "Ford Focus"], cars);

            assertEquals(1, cars);
                    //(["Audi A8", "Ford Focus"], cars);


        }





}