package ec.clicka.trees;

public class BinarySearchTreesMain {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        System.out.println("Min value: " + intTree.min());
        System.out.println("Max value: " + intTree.max());
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        intTree.traverseInOrder();
        System.out.println();

        System.out.println(intTree.get(27));
        System.out.println(intTree.get(21));
        System.out.println(intTree.get(888));

        System.out.println("Min value: " + intTree.min());
        System.out.println("Max value: " + intTree.max());

        intTree.delete(15);
        intTree.delete(27);
        intTree.delete(8888);
        intTree.traverseInOrder();
        System.out.println();

    }
}
