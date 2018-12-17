package Components;

import Interfaces.Play;

public class CDPlayer extends Component implements Play {
    private int NoOfCDsAvailable;

    public CDPlayer(String make, String model, int noOfCDsAvailable) {
        super(make, model);
        NoOfCDsAvailable = noOfCDsAvailable;
    }

    public int getNoOfCDsAvailable() {
        return NoOfCDsAvailable;
    }

    public void setNoOfCDsAvailable(int noOfCDsAvailable) {
        NoOfCDsAvailable = noOfCDsAvailable;
    }


    public String shuffle() {
        return "song Array shuffled";
    }

    public String play() {
        return "I am playing through the CD player";
    }
}
