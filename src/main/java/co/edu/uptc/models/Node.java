package co.edu.uptc.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Node<T> {
    private T info;
    private Node<T> lower = null;
    private Node<T> higher = null;

    public Node(T info) {
        this.info = info;
    }
}