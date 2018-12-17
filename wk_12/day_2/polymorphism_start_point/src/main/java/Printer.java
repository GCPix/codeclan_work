import Behaviours.IConnect;

public class Printer  implements IConnect {
    public String print(String string) {
        return "Printing, " + string;
    }

    public String connect(String data) {
        return "connecting to network:" + data;
    }
}
