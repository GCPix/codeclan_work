import Behaviours.ISwim;

public class Swimmer extends Athlete implements ISwim {
    public void swim(int distance) {
        int initialDistance = this.getDistanceTravelled();
        this.setDistanceTravelled(initialDistance += distance);

    }
}
