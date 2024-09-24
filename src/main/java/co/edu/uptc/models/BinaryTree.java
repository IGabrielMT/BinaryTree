package co.edu.uptc.models;

public class BinaryTree<T extends Comparable<T>> {
    private Node<T> root = null;

    public BinaryTree() {
    }

    public void add(T info) {
        Node<T> newNode = new Node<>(info);
        if (root == null) {
            root = newNode;
        } else {
            Node<T> found = searchNode(info);
            if (info.compareTo(found.getInfo()) > 0) {
                found.setHigher(newNode);
            } else {
                found.setLower(newNode);
            }
        }
    }

    public Node<T> searchNode(T value) {
        Node<T> aux = root;
        while (true) {
            if (value.compareTo(aux.getInfo()) > 0) {
                if (aux.getHigher() != null) {
                    aux = aux.getHigher();
                } else {
                    break;
                }
            } else {
                if (aux.getLower() != null) {
                    aux = aux.getLower();
                } else {
                    break;
                }
            }
        }
        return aux;
    }

    public void showOrder() {
        recursive(root);
    }

    private void recursive(Node<T> node) {
        if (node == null) {
            return;
        }
        recursive(node.getLower());
        System.out.println(node.getInfo());
        recursive(node.getHigher());
    }
}