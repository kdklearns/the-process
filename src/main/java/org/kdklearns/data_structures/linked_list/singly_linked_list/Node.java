package org.kdklearns.data_structures.linked_list.singly_linked_list;

public class Node<T> {
    private T data;
    private Node<T> next;

    Node (T data) {
        this.data = data;
        next = null;
    }

    T getData() {
        return data;
    }

    Node<T> getNextNode() {
        return next;
    }

    void setNextNode(Node<T> next) {
        this.next = next;
    }
}
