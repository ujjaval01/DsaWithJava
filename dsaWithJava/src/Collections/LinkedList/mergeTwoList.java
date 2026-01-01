package Collections.LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class mergeTwoList {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(10);
        l1.add(20);
        l1.add(30);
        l2.add(10);
        l2.add(60);
        l2.add(70);

        List<Integer> list = Stream.concat(l1.stream(),
                l2.stream()).sorted()
                        .toList();

        System.out.println(list);
    }

}
