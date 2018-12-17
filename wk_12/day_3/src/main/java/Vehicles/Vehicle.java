package Vehicles;

import CarComponents.Battery;
import CarComponents.Lights;
import CarComponents.Tyre;
import ENUMS.VehicleColours;
import ENUMS.VehicleMake;
import ENUMS.VehicleModel;

public abstract class Vehicle {
    Battery battery;
    Tyre wheels;
    Lights lights;
    Enum<VehicleColours> colour;
    Enum<VehicleMake> make;
    Enum<VehicleModel> model;
    private double priceBuy;
    private double priceRent;

    public Vehicle(Battery battery, Tyre wheels, Lights lights, Enum<VehicleColours> colour, Enum<VehicleMake> make, Enum<VehicleModel> model, double priceBuy, double priceRent) {
        this.battery = battery;
        this.wheels = wheels;
        this.lights = lights;
        this.colour = colour;
        this.make = make;
        this.model = model;
        this.priceBuy = priceBuy;
        this.priceRent = priceRent;
    }

    public Battery getBattery() {
        return battery;
    }

    public Tyre getWheels() {
        return wheels;
    }

    public Lights getLights() {
        return lights;
    }

    public Enum<VehicleColours> getColour() {
        return colour;
    }

    public Enum<VehicleMake> getMake() {
        return make;
    }

    public Enum<VehicleModel> getModel() {
        return model;
    }

    public double getPriceBuy() {
        return priceBuy;
    }

    public double getPriceRent() {
        return priceRent;
    }

    public void setPriceBuy(double priceBuy) {
        this.priceBuy = priceBuy;
    }

    public void setPriceRent(double priceRent) {
        this.priceRent = priceRent;
    }



}
