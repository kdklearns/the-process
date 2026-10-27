package org.kdklearns.data_structures.hashmap.using_doubly_linked_list;

public class Node<K, V> {
    private Node<K, V> previousNode;
    private K key;
    private V value;
    private Node<K, V> nextNode;

    Node(K key, V value) {
        this.key = key;
        this.value = value;
        nextNode = null;
    }

    public Node<K, V> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node<K, V> previousNode) {
        this.previousNode = previousNode;
    }

    K getKey() {
        return key;
    }

    V getValue() {
        return value;
    }

    void setValue(V value) {
        this.value = value;
    }

    void setNextNode(Node<K, V> nextNode) {
        this.nextNode = nextNode;
    }

    Node<K, V> getNextNode() {
        return nextNode;
    }
}
