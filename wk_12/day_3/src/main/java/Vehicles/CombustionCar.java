package Vehicles;

import Behaviours.IDamage;
import CarComponents.Engine;
import CarComponents.Exhaust;
import CarComponents.FuelTank;

public class CombustionCar implements IDamage {

    Engine engine;
    Exhaust exhaust;
    FuelTank fuelTank;

    public CombustionCar(Engine engine, Exhaust exhaust, FuelTank fuelTank) {
        this.engine = engine;
        this.exhaust = exhaust;
        this.fuelTank = fuelTank;
    }

    public Engine getEngine() {
        return engine;
    }

    public Exhaust getExhaust() {
        return exhaust;
    }

    public FuelTank getFuelTank() {
        return fuelTank;
    }

    public void damage() {

    }
}
