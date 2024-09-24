package co.edu.uptc;

import co.edu.uptc.models.BinaryTree;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.add("Hola");
        binaryTree.add("Mundo");
        binaryTree.add("!");
        binaryTree.add("Adios");
        binaryTree.add("Mundo");
        binaryTree.add("Cruel");
        binaryTree.showOrder();
    }
}