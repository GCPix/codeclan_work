package CarComponents;

public class Lights extends CarComponents{
    private String bulbMake;

    public Lights(String make, String model, String bulbMake) {
        super(make, model);
        this.bulbMake = bulbMake;
    }

    public String getBulbMake() {
        return bulbMake;
    }
}
