public class Mammal extends Animal {

    public Mammal(String animalName) {
        super(animalName);
    }

    public String talk(String words){
        return "I can say any words I want like " + words;
    }
}
