import java.util.ArrayList;

public class NumberList {

    private ArrayList<Integer> numbers;

    public NumberList() {
        this.numbers = new ArrayList<Integer>();
    }

    public int getNumberCount() {
        return this.numbers.size();
    }
    public void add(int number){
        this.numbers.add(number);
    }
    public int getFromIndex(int index){
        return this.numbers.get(index);
    }

    // return the total of the number list
    public int getTotalClassic(){
        int total = 0;
        for (int i=0; i<getNumberCount(); i++){
            System.out.println("index: " + i);
            System.out.println("total: " + total);
            total += getFromIndex(i);
        }
        return total;
    }

    public int getTotalEnhanced(){
        int total = 0;

        //int number is a scoped type.
        for(int number: this.numbers){
            total+=number;
        }
        return total;
    }
}
