import static com.sun.org.apache.xalan.internal.xsltc.compiler.util.Util.println;

public class Planets {
    private String name;
    private int size;

    public Planets(String name, int size){
        this.name = name;
        this.size = size;
    }

    public String getPlanetName(){
        return this.name;
    }
    public int getPlanetSize(){
        return this.size;
    }
    public void planetExplode(){
     System.out.println("We created a black hole!");
    }
}
