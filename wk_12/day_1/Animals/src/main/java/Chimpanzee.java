public class Chimpanzee extends Mammal {
    public Chimpanzee(String animalName) {
        super(animalName);
    }

        public String walk(){
        return this.getAnimalName() + " is walking but not upright";

    }
}
