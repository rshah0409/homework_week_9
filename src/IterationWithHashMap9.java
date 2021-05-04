import java.util.HashMap;
import java.util.Map;

//Create a HashMap object called people that will store String keys and Integer values: And use for each loop to iterate the value from Map.
public class IterationWithHashMap9 {

    public static void main(String[] args) {
        Map<String,Integer> people = new HashMap<String,Integer>();  //arraylist with hashmap
        people.put("Horse",1);
        people.put("Elephant",2);
        people.put("Bear",3);
        people.put("Fish",4);
        people.put("Penguin",5);
        people.put("Hippo",6);
        people.put("Dino",7);

       // System.out.println(myList);
        for(Integer myList:people.values()){     //for each loop used for executing arraylist
            System.out.println(myList);
        }
        


    }








}
