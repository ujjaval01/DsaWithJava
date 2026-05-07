package wrapperClass;

public class wrapperClassEx {
    public static void main(String[] args) {
        // Autoboxing- int to Integer, boolean to Boolean
        int a = 12;
        Integer b = 13;
        Integer c = Integer.valueOf("15");
        System.out.println(c * 4);

        /* unboxing- Integer to int, Boolean to boolean */
        int d = c;
        System.out.println(d);
    }

}
