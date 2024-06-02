package ec.clicka.lists.linked.singly;

import lombok.Data;

@Data
public class IntegerNode {

    private Integer value;
    private IntegerNode next;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public String toString() {
        return value.toString();
    }
}
