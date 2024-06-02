package ec.clicka.lists.linked.doubly;

import ec.clicka.model.Employee;
import lombok.Data;

@Data
public class EmployeeDoublyNode {

    private Employee employee;
    private EmployeeDoublyNode next;
    private EmployeeDoublyNode previous;

    public EmployeeDoublyNode(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
