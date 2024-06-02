package ec.clicka.lists;

import ec.clicka.model.Employee;

import java.util.List;
import java.util.Vector;

public class VectorsJdkMain {
    public static void main(String[] args) {
        List<Employee> employeeList = new Vector<>();
        employeeList.add(new Employee("James","Jones",123));
        employeeList.add(new Employee("Jhon","Doe",4657));
        employeeList.add(new Employee("Mary","Smith",22));
        employeeList.add(new Employee("Mike","Wilson",2345));
        employeeList.forEach(employee -> System.out.println(employee));
    }
}
