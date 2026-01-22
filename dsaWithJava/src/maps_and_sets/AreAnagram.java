package maps_and_sets;

import java.util.HashMap;

public class AreAnagram {
    public static void main(String[] args) {
        String s1 = "geeks";
        String s2 = "kseeg";

        System.out.println(areAnagrams(s1,s2));
    }
    public static boolean areAnagrams(String s1, String s2) {
//        s1 = "geeks" s2 = "kseeg"
        // code here

        if(s1.length() != s2.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        for (char s : s1.toCharArray()){
            if(map1.containsKey(s)){
                int freq = map1.get(s);
                map1.put(s, freq+1);
            }else{
                map1.put(s,1);
            }
        }

        HashMap<Character, Integer> map2 = new HashMap<>();
        for (char s : s2.toCharArray()){
            if(map2.containsKey(s)){
                int freq = map2.get(s);
                map2.put(s, freq+1);
            }else{
                map2.put(s,1);
            }
        }
        return map1.equals(map2);
    }
}
