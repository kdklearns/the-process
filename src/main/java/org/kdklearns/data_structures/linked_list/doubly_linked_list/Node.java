package org.kdklearns.data_structures.linked_list.doubly_linked_list;

public class Node<K> {
    private Node<K> previousNode;
    private K data;
    private Node<K> nextNode;

    public Node(K data) {
        this.data = data;
    }

    public Node<K> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<K> previousNode) {
        this.previousNode = previousNode;
    }

    public K getData() {
        return data;
    }

    public void setData(K data) {
        this.data = data;
    }

    public Node<K> getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node<K> nextNode) {
        this.nextNode = nextNode;
    }
}
