import java.util.HashMap;

public class hashmapDemo {
    //type psvm to create runner
    public static void main(String[] args) {
//        HashMap<String, String> favouriteFruits = new HashMap<String, String>();
//
//        favouriteFruits.put("David", "tangerine");
//        favouriteFruits.put("Gillian", "mango");
//        favouriteFruits.put("Colin", "none");
//
//
//        System.out.println(favouriteFruits.get("David"));
//        System.out.println(favouriteFruits.values());

        HashMap<String, Integer> ages = new HashMap<String, Integer>();
        ages.put("colin", 35);
        ages.put("john", 38);
        Integer colinAge = ages.get("colin");
        String output = "colin's age is " + colinAge.toString();
        System.out.println(output);
        System.out.println(ages.size());
        //ages.clear();
        System.out.println(ages.containsValue(35)); // will show true
//        ages.remove("colin");
        System.out.println(ages.keySet());
    }
}
