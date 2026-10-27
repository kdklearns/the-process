package org.kdklearns.data_structures.linked_list.singly_linked_list;

public class MyLinkedList<T> {
    private Node<T> head;

    public void add (T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node<T> mover = head;
        while (mover.getNextNode() != null) {
            mover = mover.getNextNode();
        }
        mover.setNextNode(newNode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Node<T> mover = head;
        while (mover != null) {
            sb.append(mover.getData());
            sb.append(mover.getNextNode() != null ? ", " : "]");
            mover = mover.getNextNode();
        }
        return sb.toString();
    }
}
