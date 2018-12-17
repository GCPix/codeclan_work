package CarComponents;

public class Engine extends CarComponents {
    private int horsepower;

    public Engine(String make, String model, int horsepower) {
        super(make, model);
        this.horsepower = horsepower;
    }

    public int getHorsepower() {
        return horsepower;
    }
}
