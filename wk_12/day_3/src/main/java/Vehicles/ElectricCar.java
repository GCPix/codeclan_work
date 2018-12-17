package Vehicles;

import Behaviours.IDamage;
import CarComponents.ElectricMotor;

public class ElectricCar implements IDamage {
    ElectricMotor electricMotor;

    public ElectricCar(ElectricMotor electricMotor) {
        this.electricMotor = electricMotor;
    }

    public ElectricMotor getElectricMotor() {
        return electricMotor;
    }

    public void damage() {

    }
}
