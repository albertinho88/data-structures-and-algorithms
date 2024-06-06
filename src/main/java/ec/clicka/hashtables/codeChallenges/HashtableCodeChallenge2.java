package ec.clicka.hashtables.codeChallenges;

import ec.clicka.model.Employee;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *  INSTRUCTIONS:
 * - Remove duplicate items from a linked list.
 * - Your solution must use the JDK's LinkedList class.
 * - Your solution must use a HashMap.
 * - Start with existing code
 */
public class HashtableCodeChallenge2 {
    public static void main(String[] args) {

        LinkedList<Employee> employees = new LinkedList<>();
        employees.add(new Employee("Jane", "Jones", 123));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Mike", "Wilson", 45));
        employees.add(new Employee("Mary", "Smith", 5555));
        employees.add(new Employee("John", "Doe", 5678));
        employees.add(new Employee("Bill", "End", 3948));
        employees.add(new Employee("Jane", "Jones", 123));

        employees.forEach(e -> System.out.println(e));
        System.out.println();

        Map<Integer, Employee> employeeMap = new HashMap<>();
        employees.forEach(e -> {
            employeeMap.putIfAbsent(e.getId(), e);
        });

        employees = new LinkedList<>();
        for (Employee e : employeeMap.values()) {
            employees.add(e);
        }

        employees.forEach(e -> System.out.println(e));

    }

    public static int hash(int value) {
        return Math.abs(value % 10);
    }
}
