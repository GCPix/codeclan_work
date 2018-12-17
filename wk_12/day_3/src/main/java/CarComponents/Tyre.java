package CarComponents;

public class Tyre extends CarComponents {
    private int width;
    private int aspectRatio;
    private int rimDiameter;

    public Tyre(String make, String model, int width, int aspectRatio, int rimDiameter) {
        super(make, model);
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.rimDiameter = rimDiameter;
    }

    public int getWidth() {
        return width;
    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public int getRimDiameter() {
        return rimDiameter;
    }
}
