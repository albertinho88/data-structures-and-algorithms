package ec.clicka.lists.linked;

import ec.clicka.model.Employee;
import ec.clicka.util.LinkedListUtil;

import java.util.LinkedList;

public class LinkedListJdkMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("James", "Jones", 123);
        Employee e2 = new Employee("Jhon", "Doe", 4657);
        Employee e3 = new Employee("Mary", "Smith", 22);
        Employee e4 = new Employee("Mike", "Wilson", 2345);
        Employee e5 = new Employee("Bill", "End", 78);

        LinkedList<Employee> list = new LinkedList<>();
        LinkedListUtil.printLinkedList(list);
        list.addFirst(e1);
        list.addFirst(e2);
        list.addFirst(e3);
        list.addFirst(e4);

        LinkedListUtil.printLinkedList(list);

        list.add(2,e5);
        LinkedListUtil.printLinkedList(list);

        list.removeFirst();
        LinkedListUtil.printLinkedList(list);

        list.removeLast();
        LinkedListUtil.printLinkedList(list);

        list.remove();
        LinkedListUtil.printLinkedList(list);

    }
}
