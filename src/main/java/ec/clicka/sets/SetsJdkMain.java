package ec.clicka.sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetsJdkMain {
    public static void main(String[] args) {
        Set<Integer> set = new LinkedHashSet();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);
        set.add(3);

        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
