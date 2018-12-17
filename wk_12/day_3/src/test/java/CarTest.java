import CarComponents.Battery;
import CarComponents.Lights;
import CarComponents.Tyre;
import ENUMS.VehicleColours;
import ENUMS.VehicleMake;
import ENUMS.VehicleModel;
import Vehicles.Car;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CarTest {
    Battery battery;
    Tyre wheels;
    Lights lights;
    Car car;

    @Before
    public void setUp() throws Exception {
        battery = new Battery("Vorta", "V100", 90,108);
        wheels = new Tyre("Michellin", "Winter", 180, 22, 17);
        lights = new Lights("Standard", "bright", "lights");
        car = new Car(battery, wheels, lights, VehicleColours.MOONDUST_SILVER, VehicleMake.FORD,
                VehicleModel.FOCUS_ECO, 17000.00, 139.00);
    }

    @Test
    public void hasMake() {
        assertEquals("FORD", car.getMake().toString());
    }

    @Test
    public void hasModel() {
        assertEquals("FOCUS_ECO", car.getModel().toString());
    }

    @Test
    public void hasBattery() {
        assert(car.getBattery() instanceof Battery);
    }

    @Test
    public void hasTyres() {
        assert(car.getWheels() instanceof Tyre);
    }

    @Test
    public void hasLights() {
        assert(car.getLights() instanceof Lights);
    }

    @Test
    public void hasBuyingPrice() {
        assertEquals(17000.00, car.getPriceBuy(), 0.01);
    }

    @Test
    public void hasRentingPrice() {
        assertEquals(139.00, car.getPriceRent(), 0.01);
    }
}
