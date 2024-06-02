package ec.clicka.lists;

import ec.clicka.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsJdkMain {

    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("James","Jones",123));
        employeeList.add(new Employee("Jhon","Doe",4657));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",2345));

        employeeList.set(1, new Employee("Jhon","Adams",4568)); // O(1) time complexity because we have the index of the element.

        employeeList.add(1, new Employee("Jhon","Doe",4567)); // O(n) time complexity



        //System.out.println(employeeList.get(1));
        //System.out.println(employeeList.isEmpty());

        System.out.println(employeeList.size());

        Employee[] employeeArray = employeeList.toArray(new Employee[employeeList.size()]);
        for(Employee employee : employeeArray) {
            System.out.println(employee);
        }

        System.out.println(employeeList.contains(new Employee("Mary","Smith",22)));
        System.out.println(employeeList.indexOf(new Employee("Jhon","Doe",4567)));

        employeeList.remove(2);

        employeeList.forEach(employee -> System.out.println(employee));

    }

}
