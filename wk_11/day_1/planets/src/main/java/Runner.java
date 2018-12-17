public class Runner {
    // psvm return will give you the starter for main method
    public static void main(String[] args){
        Planets planet = new Planets("Mars", 908973);
        String planetName = planet.getPlanetName();
        int planetSize = planet.getPlanetSize();
        System.out.println("planet "+ planetName + " is " + planetSize);
        planet.planetExplode();
    }
}
