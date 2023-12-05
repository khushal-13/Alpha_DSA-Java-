import java.util.HashMap;
import java.util.Set;;

public class HasingMap {

    public static void HashMapIteration(){

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India", 200);
        hm.put("China",300);
        hm.put("Nepal",50);
        hm.put("US",150);

        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("Key = "+k+" and"+"  Value = "+hm.get(k));            
        } 

    }

    public static void main(String[] args) {
       
        /*
        HashMap<String,Integer> hm = new HashMap<>();

        //Put Operation   TC : O(1)
        hm.put("India", 100);
        hm.put("China", 200);
        hm.put("Nepal", 50);

        System.out.println(hm);

        //Get Operation
        int population=hm.get("India");
        System.out.println("India's Population is : "+population);
        
        System.out.println(hm.get("Bhutan")); // Shows NULL if key doesn't exist

        // ContainsKey 
        // Checks whether a key is present or not
        System.out.println(hm.containsKey("India"));//True
        System.out.println(hm.containsKey("Bhutan"));//False

        //Remove Operation
        //Removes a key value pair using only key
        hm.remove("China");
        System.out.println(hm);

        //Size Operation
        System.out.println(hm.size());

        //Is Empty Operation
        System.out.println(hm.isEmpty());


        //Clear Operation
        hm.clear();
        System.out.println(hm);
        System.out.println(hm.isEmpty());

         */

         HashMapIteration();



    }
    
}
