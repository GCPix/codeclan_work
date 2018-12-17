import java.util.ArrayList;

public class Bear {

    private String name;
    private ArrayList<Salmon> belly;

    public Bear(String name) {
        this.name = name;
        this.belly = new ArrayList<Salmon>();
    }

    public int foodCount() {
        return this.belly.size();
    }

    public void eatsSalmonFromRiver(River river) {
        Salmon salmon = river.removeFish();
        this.belly.add(salmon);
    }

    public void sleeps() {
        this.belly.clear();
    }
}
