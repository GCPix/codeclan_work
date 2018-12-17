package Components;


import Interfaces.Play;

public class TapePlayer extends Component implements Play {

    boolean continuousPlay;

    public TapePlayer(String make, String model) {
        super(make, model);
        this.continuousPlay = false;
    }

    public boolean isContinuousPlay() {
        return continuousPlay;
    }

    public void setContinuousPlay(boolean continuousPlay) {
        this.continuousPlay = continuousPlay;
    }

    public String play() {
        return "I am playing through the tape deck";
    }
}
