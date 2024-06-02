package ec.clicka.lists.linked.singly;

import ec.clicka.model.Employee;
import lombok.Data;

@Data
public class EmployeeNode {

    private Employee employee;
    private EmployeeNode next;

    public EmployeeNode(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return employee.toString();
    }
}
