package ec.clicka.hashtables;

import ec.clicka.model.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashtablesJdkMain {
    public static void main(String args[]) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Jhon", "Doe", 4657);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 2345);
        Employee billEnd = new Employee("Bill", "End", 78);

        Map<String, Employee> hashMap = new HashMap<>();
        hashMap.put("Jones", janeJones);
        hashMap.put("Doe", johnDoe);
        hashMap.put("Smith", marySmith);
        hashMap.put("Wilson", mikeWilson);
        //Employee employee = hashMap.put("Doe", mikeWilson);
        //Employee employee2 = hashMap.putIfAbsent("Doe", mikeWilson);
        //System.out.println(employee2);

        //System.out.println(hashMap.getOrDefault("Someone", mikeWilson));

        //System.out.println(hashMap.remove("Jones"));

        //System.out.println(hashMap.containsKey("Doe"));
        //System.out.println(hashMap.containsValue(mikeWilson));

        //System.out.println(hashMap);

        hashMap.forEach((k,v) -> System.out.println("Key = " + k + ", Employee = " + v));

    }
}
