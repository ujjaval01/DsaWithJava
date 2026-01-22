package maps_and_sets;

import java.util.HashMap;

public class HashMapPrintingWithOccurance {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 10);
        map.put("D", 40);
        map.put("E", 30);
        map.put("F", 20);

        HashMap<Integer, Integer> hm = new HashMap<>();


        for(String key : map.keySet()){
            int value = map.get(key);

            if(hm.containsKey(value)){
                hm.put(value, hm.get(value) + 1);
            }else{
                hm.put(value, 1);
            }
        }

        System.out.println(hm);
    }
}
