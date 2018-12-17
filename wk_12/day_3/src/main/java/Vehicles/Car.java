package Vehicles;

import CarComponents.Battery;
import CarComponents.Lights;
import CarComponents.Tyre;
import ENUMS.VehicleColours;
import ENUMS.VehicleMake;
import ENUMS.VehicleModel;

public class Car extends Vehicle {
    public Car(Battery battery, Tyre wheels, Lights lights, Enum<VehicleColours> colour, Enum<VehicleMake> make, Enum<VehicleModel> model, double priceBuy, double priceRent) {
        super(battery, wheels, lights, colour, make, model, priceBuy, priceRent);
    }



}
