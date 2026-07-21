package string;

public class ReverseEachWords {
    public static void main(String[] args) {
        String str = "my name is ujjaval";
        System.out.println(reverseWords(str));

    }

    public static String reverseWords(String str) {
        String result = "";
        String word = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ' ') {
                word += ch;
            } else {
                if (word.length() > 0) {
                    // reverse word
                    for (int j = word.length() - 1; j >= 0; j--) {
                        result += word.charAt(j);
                    }
                    result += " ";
                    word = "";
                }
            }
        }

        // reverse last word
        if (!word.isEmpty()) {
            for (int j = word.length() - 1; j >= 0; j--) {
                result += word.charAt(j);
            }
        }

        return result.trim();
    }
}
