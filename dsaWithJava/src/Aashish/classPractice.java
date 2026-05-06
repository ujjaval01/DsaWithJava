package Aashish;

public class classPractice {
    public static void main(String[] args) {
        aashish abc = new aashish();
        abc.func();
    }
}
 class aashish{
    String name = "aashish";
    int num = 23;
    aashish(){
        System.out.println("hiii");
    }
    public void func(){
        System.out.println(name + num);
    }
}