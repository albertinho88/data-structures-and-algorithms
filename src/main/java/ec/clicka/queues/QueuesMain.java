package ec.clicka.queues;

import ec.clicka.model.Employee;

public class QueuesMain {
    public static void main(String[] args) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Jhon", "Doe", 4657);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 2345);
        Employee billEnd = new Employee("Bill", "End", 78);

        ArrayQueue queue = new ArrayQueue(5);
        queue.add(janeJones);
        queue.add(johnDoe);
        queue.add(marySmith);
        queue.remove();
        queue.add(mikeWilson);
        queue.remove();
        queue.add(billEnd);
        queue.remove();
        queue.add(janeJones);
        queue.remove();
        queue.add(billEnd);
        queue.add(johnDoe);

        queue.printQueue();

    }
}
