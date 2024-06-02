package ec.clicka.lists.linked.doubly;

import ec.clicka.model.Employee;
import lombok.Data;

@Data
public class EmployeeDoublyLinkedList {

    private EmployeeDoublyNode head;
    private EmployeeDoublyNode tail;
    private int size;

    public void addToFront(Employee employee) {
        EmployeeDoublyNode newNode = new EmployeeDoublyNode(employee);

        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }

        head = newNode;
        size++;
    }

    public void addToEnd(Employee employee) {
        EmployeeDoublyNode newNode = new EmployeeDoublyNode(employee);

        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public boolean addBefore(Employee newEmployee, Employee existingEmployee) {

        // return true if you were able to successfully add the employee
        // into the list before the existing employee. Return false
        // if the existing employee doesn't exist in the list

        if (isEmpty()) {
            return false;
        }

        // find the existing employee
        EmployeeDoublyNode current = head;
        while (current != null && !current.getEmployee().equals(existingEmployee)) {
            current = current.getNext();
        }

        if (current == null) {
            return false;
        }

        EmployeeDoublyNode newNode = new EmployeeDoublyNode(newEmployee);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current) {
            head = newNode;
        } else {
            newNode.getPrevious().setNext(newNode);
        }

        size++;
        return true;
    }

    public EmployeeDoublyNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }

        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public EmployeeDoublyNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeDoublyNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void printList() {
        EmployeeDoublyNode current = head;

        System.out.print("HEAD <-> ");
        while (current != null) {
            System.out.print(current);
            System.out.print(" <-> ");
            current = current.getNext();
        }
        System.out.print("null");
        System.out.println("");
    }
}
