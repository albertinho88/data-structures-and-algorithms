package ec.clicka.hashtables.chaining;

import ec.clicka.model.Employee;

public class HashtableChainingMain {
    public static void main(String args[]) {
        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("Jhon", "Doe", 4657);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 2345);
        Employee billEnd = new Employee("Bill", "End", 78);
        ChainedHashtable ht = new ChainedHashtable();
        ht.put("Jones", janeJones);
        ht.put("Doe", johnDoe);
        ht.put("Wilson", mikeWilson);
        ht.put("Smith", marySmith);
        ht.put("End", billEnd);

        ht.printHashtable();
        System.out.println();

        //System.out.println("Retrieve key Wilson: " + ht.get("Wilson"));

        System.out.println("Remove key Jones: " + ht.remove("Jones"));
        System.out.println("Remove key Doe: " + ht.remove("Doe"));

        ht.printHashtable();
        System.out.println();

        //System.out.println("Retrieve key Smith: " + ht.get("Smith"));
    }
}
