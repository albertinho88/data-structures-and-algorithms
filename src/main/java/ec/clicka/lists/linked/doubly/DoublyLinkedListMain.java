package ec.clicka.lists.linked.doubly;

import ec.clicka.model.Employee;

public class DoublyLinkedListMain {

    public static void main(String[] args) {
        Employee e1 = new Employee("James", "Jones", 123);
        Employee e2 = new Employee("Jhon", "Doe", 4657);
        Employee e3 = new Employee("Mary", "Smith", 22);
        Employee e4 = new Employee("Mike", "Wilson", 2345);

        EmployeeDoublyLinkedList list = new EmployeeDoublyLinkedList();
        list.addToFront(e1);
        list.addToFront(e2);
        list.addToFront(e3);
        list.addToEnd(e4);

        list.printList();
        System.out.println(list.getSize());

        list.removeFromFront();

        list.printList();
        System.out.println(list.getSize());

        list.removeFromEnd();
        list.removeFromEnd();

        list.printList();
        System.out.println(list.getSize());
    }

}
