package ec.clicka.trees.codeChallenges;

import ec.clicka.trees.Tree;

/**
 * INSTRUCTIONS:
 * - Add preorder traversal to our Tree implementation.
 */
public class BsTreesCodeChallenge1 {
    public static void main(String[] args) {
        Tree intTree = new Tree();
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

        intTree.traversePreOrder();

    }
}
