import java.util.*;

class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> hash_map = new HashMap<Integer, String>();
        
        hash_map.put(10, "Geeks");
        hash_map.put(15, "4");
        hash_map.put(20, "Geeks");
        hash_map.put(25, "Welcome");
        hash_map.put(30, "You");

        System.out.println("Initial mappings: " + hash_map);
        System.out.println("The set is: " + hash_map.entrySet());

    }
}
