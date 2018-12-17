package Components;

public abstract class Component {

//todo Stereo extends Components.Component String name; int volume;
//CDplayer int NoOfCDsAvailable;  shuffle()
//Tape Deck boolean continuous play;
//todo Radio, arraylist of preset stations, String tune()
//todo MP3 player implements IConnect
//Components.Component abstract, make/model
//todo Interfaces play, record, IConnect

    private String make;
    private String model;

    public Component(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


}
