public class Runner {
    public static void main(String[] args){
        Bear bear = new Bear("Baloo");

        String name = bear.getName();
        System.out.println(name);

        bear.setName("Paddington");
        String newName = bear.getName();
        System.out.println(newName);
    }
}
