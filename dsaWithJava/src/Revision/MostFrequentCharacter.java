package Revision;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        String s = "character";
        System.out.println(getMaxOccuringChar(s));
    }
    public static char getMaxOccuringChar(String s) {
        // code here
        int n = s.length();
        int maxFreq = -1;
        char ans = s.charAt(0);

        for(int i = 0; i<n; i++){
            int freq = 1;
            char ch = s.charAt(i);
            for(int j = i+1; j<n; j++){
                if(ch == s.charAt(j)){
                    freq++;
                }
            }
            if(freq > maxFreq){
                maxFreq = freq;
                ans = ch;
            }
            else if(freq == maxFreq && ch < ans){
                ans = ch;
            }
        }

        return ans;

    }
}
