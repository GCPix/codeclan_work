package CarComponents;

public class Battery extends CarComponents{
    private int cca;
    private int ampHour;

    public Battery(String make, String model, int cca, int ampHour) {
        super(make, model);
        this.cca = cca;
        this.ampHour = ampHour;
    }

    public int getCca() {
        return cca;
    }

    public int getAmpHour() {
        return ampHour;
    }
}
