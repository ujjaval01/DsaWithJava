package maps_and_sets;

import java.util.HashSet;

public class SetPractice {
    public static void main(String[] args) {

        // add(), remove(), contains(), size(), isEmpty(), clear()

        HashSet<Integer> hs = new HashSet<>();
        hs.add(11);
        hs.add(14);
        hs.add(87);
        hs.add(44);
        hs.add(11);   // duplicates(no error, but consider only once) also size -1

        System.out.println(hs);
        System.out.println(hs.size());

        hs.remove(4); //Agar value nhi h HashSet me to remove koi kaam nhi karega
        System.out.println(hs);
        hs.remove(44);  // Agar hai to value remove kar dega
        System.out.println(hs);

        System.out.println(hs.contains(11));   // searching in O(1)

        hs.clear();  // Set me jitne bhi elements h sbko remove kar deta hai
        System.out.println(hs);
    }
}
