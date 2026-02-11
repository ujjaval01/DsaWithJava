package LeetCodeQuestions;

import java.util.HashMap;

public class Q387FirstUniqueCharacterInAString {
    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
    public static int firstUniqChar(String s) {
        int n = s.length();

        // Hashing with Frequency count...
        HashMap<Character, Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            // if(map.containsKey(ch)){
            //     map.put(ch, map.get(ch)+1);
            // }else{
            //     map.put(ch, 1);
            // }
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(int i = 0; i<n; i++){
            if(map.get(s.charAt(i)) == 1) return i;
        }

        return -1;



        // // bruteforce O(n*2)
        // for (int i = 0; i < n; i++) {
        //     boolean isUnique = true;
        //     for (int j = 0; j < n; j++) {
        //         if (i != j && s.charAt(i) == s.charAt(j)) {
        //             isUnique = false;
        //             break;
        //         }
        //     }
        //     if (isUnique) return i;
        // }
        // return -1;
    }
}
