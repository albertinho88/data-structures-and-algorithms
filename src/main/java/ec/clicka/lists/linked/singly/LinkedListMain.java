package ec.clicka.lists.linked.singly;

import ec.clicka.model.Employee;

public class LinkedListMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("James","Jones",123);
        Employee e2 =new Employee("Jhon","Doe",4657);
        Employee e3 =new Employee("Mary","Smith",22);
        Employee e4 =new Employee("Mike","Wilson",2345);

        EmployeeLinkedList list = new EmployeeLinkedList();
        list.addToFront(e1);
        list.addToFront(e2);
        list.addToFront(e3);
        list.addToFront(e4);

        list.printList();

        list.removeFromFront();
        list.printList();

        list.removeFromFront();
        list.printList();

        list.addToFront(e4);
        list.printList();

        System.out.println("size: " + list.getSize());
        System.out.println("Is empty: " + list.isEmpty());
    }
}
