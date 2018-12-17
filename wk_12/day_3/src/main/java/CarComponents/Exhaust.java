package CarComponents;

public class Exhaust extends CarComponents {
    private int tailWidth;

    public Exhaust(String make, String model, int tailWidth) {
        super(make, model);
        this.tailWidth = tailWidth;
    }

    public int getTailWidth() {
        return tailWidth;
    }
}
