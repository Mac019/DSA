import java.util.HashMap;

public class HashMap1 {

    public static void main(String[] args) {
        //Country(key) , population(value)

        HashMap<String , Integer> map = new HashMap<>();

        //Insertion 
        map.put("India" , 120);
        map.put("USA" , 500);
        map.put("China" , 150);

        System.out.println(map); 

        map.put("China", 200);
        
        System.out.println(map);

        //Search 
        if(map.containsKey("Chinaa")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China")); // key exists
        System.out.println(map.get("Thailand"));//ket doesn't exists

        int arr [] = {12, 15 , 18};
        
        
    }
    
}
