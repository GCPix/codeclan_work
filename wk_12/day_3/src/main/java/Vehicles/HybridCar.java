package Vehicles;

import Behaviours.IDamage;
import CarComponents.ElectricMotor;
import CarComponents.Engine;
import CarComponents.Exhaust;
import CarComponents.FuelTank;

public class HybridCar implements IDamage {
    Engine engine;
    Exhaust exhaust;
    FuelTank fuelTank;
    ElectricMotor electricMotor;

    public HybridCar(Engine engine, Exhaust exhaust, FuelTank fuelTank, ElectricMotor electricMotor) {
        this.engine = engine;
        this.exhaust = exhaust;
        this.fuelTank = fuelTank;
        this.electricMotor = electricMotor;
    }


    public void damage() {

    }
}
