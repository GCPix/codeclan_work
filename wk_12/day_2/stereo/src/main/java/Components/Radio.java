package Components;

import Interfaces.Play;

import java.util.ArrayList;

public class Radio extends Component implements Play {

    private String presetStations[];
    private String currentStation;

    public Radio(String make, String model) {
        super(make, model);
        this.presetStations  = new String [6];
        this.currentStation = null;
    }


    public String[] getPresetStations() {
        return presetStations;
    }


    public String getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(String currentStation) {
        this.currentStation = currentStation;
    }

    public String play() {
        return "This is playing through the radio, it is " + this.getCurrentStation() + " station!";
    }

    public void addStation(String s) {

        if (this.presetStations[0] != null) {
            this.presetStations[0] = s;
        } else {
            for (int i = 1; i < this.presetStations.length; i++) {


            }
        }
    }

}
