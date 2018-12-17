package CarComponents;

public abstract class CarComponents {
    private String make;
    private String model;


    public CarComponents(String make, String model) {
        this.make = make;
        this.model = model;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }


}

