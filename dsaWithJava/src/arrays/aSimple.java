package arrays;

import java.util.HashSet;
import java.util.LinkedList;

public class aSimple {
    public static void main(String[] args) {

    }
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        HashSet<Character> hs1 = new HashSet<>();
        for(int i = 0; i<s.length(); i++){
            hs1.add(s.charAt(i));
        }
        HashSet<Character> hs2 = new HashSet<>();
        for(int j = 0; j<t.length(); j++){
            hs2.add(t.charAt(j));
        }

        return hs1.equals(hs2);


    }
}
