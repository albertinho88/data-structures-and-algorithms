package ec.clicka.util;

import java.util.LinkedList;

public class LinkedListUtil {

    public static void printLinkedList(LinkedList list) {

        /*Iterator iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }*/

        System.out.print("HEAD -> ");
        list.forEach(e -> {
            System.out.print(e);
            System.out.print(" <-> ");
        });
        System.out.println("null");
    }

}
