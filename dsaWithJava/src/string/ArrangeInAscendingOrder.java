package string;

public class ArrangeInAscendingOrder {
    public static void main(String[] args) {
        String s = "ebacd";

        char x = s.charAt(0);
        char y = s.charAt(1);


        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder(s);

//        int a = 'a';
//        int b = 'b';
//
//        if(a <b ){
//            System.out.println("a");
//            System.out.println(a);
//        }else System.out.println("b");

        for(int i = 0; i<s.length(); i++){
            for (int j = i+1; j<s.length(); j++){
                int c = s.charAt(i);
                int d = s.charAt(j);

                if(c < d){
                    char temp = s.charAt(i);

                }
            }
        }
    }
}
