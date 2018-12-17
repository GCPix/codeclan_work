public class Animal {
//    Your base class should be Animal, and should have methods for eat() and breathe().
//    Create a subclass of Animal called Mammal. Mammals should have a talk() method.
//    Create two further subclasses of Mammal: Human and Chimpanzee. They should have a walk() method.
//    Make each method return a suitable string. Check that you can create a human and a chimpanzee object, and make sure that they can each eat, breathe, walk, and talk.

    protected String animalName;

    public Animal(String animalName) {
        this.animalName = animalName;
    }

    public String getAnimalName() {
        return this.animalName;
    }

    public void setAnimalName(String animalName) {
        this.animalName = animalName;
    }

    public String eat(String food){
        return this.animalName + " is eating a " + food;
    }

    public String breathe(){
        return this.animalName + " is breathing";
    }

}
