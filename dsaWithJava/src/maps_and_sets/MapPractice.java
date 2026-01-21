package maps_and_sets;

import java.util.HashMap;

public class MapPractice {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 30);
        map.put("D", 40);

//        System.out.println(map);
//        System.out.println(map.get("A"));

        // Traversing using keySet()...
        for (String key : map.keySet()){
            System.out.println(key + " " + map.get(key));
        }
    }
}
