package ec.clicka.trees;

import lombok.Data;

@Data
public class Tree {

    private final static String INDENTATION = "------";

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    public TreeNode delete(TreeNode subtreeRoot, int value) {
        if (subtreeRoot == null) {
            return subtreeRoot;
        }
        if (value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        } else if (value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        } else {
            // Case 1 and 2 : node to delete has 0 or 1 child(ren)
            if (subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            } else if (subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }

            // Case 3 : node to delete has 2 children

            // Replace the value in the subtreeRoot node with the smallest value
            // from the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());

            // Delete the node that has the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }

        return subtreeRoot;
    }

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }

    public void traverseInOrder() {
        if (root != null) {
            root.traverseInOrder();
        }
    }

    public void traversePreOrder() {
        if (root != null) {
            root.traversePreOrder();
        }
    }

    public void printTree() {
        if (root != null) {
            printTreeNode(root, INDENTATION);
        } else {
            System.out.println("The tree is empty!");
        }
    }

    private void printTreeNode(TreeNode node, String indentation) {
        System.out.println(indentation + node.getData());
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            return;
        }
        if (node.getLeftChild() != null) {
            printTreeNode(node.getLeftChild(), indentation + node.getData() +  " Left " + INDENTATION);
        }
        if (node.getRightChild() != null) {
            printTreeNode(node.getRightChild(), indentation + node.getData() + " Right " + INDENTATION);
        }
    }

}
