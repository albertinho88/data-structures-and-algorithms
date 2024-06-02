package ec.clicka.lists.code.challenges;

import ec.clicka.lists.linked.singly.IntegerLinkedList;

/**
 *  INSTRUCTIONS:
 * - Implement a method in the IntegerLinkedList class that inserts a value in sorted order.
 * - Lower values should appear first in the list (be closer to the head)
 * - If we insert 4,2,1,5 list should look like: HEAD->1->2->4->5->null
 * - IntegerLinkedList is a singly-linked list
 */
public class CodeChallenge2 {
    public static void main(String[] args) {

        Integer one = 1;
        Integer two = 2;
        Integer three = 3;
        Integer four = 4;

        IntegerLinkedList list = new IntegerLinkedList();
        list.insertSorted(three);
        list.printList();
        list.insertSorted(two);
        list.printList();
        list.insertSorted(one);
        list.printList();
        list.insertSorted(four);
        list.printList();

    }
}
