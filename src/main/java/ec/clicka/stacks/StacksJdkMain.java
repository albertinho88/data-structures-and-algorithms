package ec.clicka.stacks;

import ec.clicka.model.Employee;

public class StacksJdkMain {
    public static void main(String[] args) {

        Employee e1 = new Employee("James", "Jones", 123);
        Employee e2 = new Employee("Jhon", "Doe", 4657);
        Employee e3 = new Employee("Mary", "Smith", 22);
        Employee e4 = new Employee("Mike", "Wilson", 2345);

        LinkedStack stack = new LinkedStack();
        stack.push(e1);
        stack.push(e2);
        stack.push(e3);
        stack.push(e4);

        stack.printStack();
        System.out.println();
        System.out.println(stack.peek());
        System.out.println();

        System.out.println("Popped: " + stack.pop());
        stack.printStack();
        System.out.println();

        System.out.println(stack.peek());
        System.out.println();

        stack.push(e4);
        stack.printStack();

    }
}
