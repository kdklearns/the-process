package org.kdklearns.data_structures.linked_list.doubly_linked_list;

public class MyDoublyLinkedList<K> {
    private Node<K> head;

    public void add(K data) {
        if (head == null) {
            head = new Node<>(data);
            return;
        }

        Node<K> mover = head;
        while (mover.getNextNode() != null) {
            mover = mover.getNextNode();
        }

        Node<K> newNode = new Node<>(data);
        mover.setNextNode(newNode);
        newNode.setPreviousNode(mover);
    }

    public void remove(K data) {
        if (head == null) {
            return;
        }

        // check whether node to be removed is the head
        if (head.getData().equals(data)) {
            head = head.getNextNode();
            head.setPreviousNode(null);
            return;
        }

        Node<K> mover = head;
        while (mover != null) {
            if (mover.getData().equals(data)) {
                // perform remove
                Node<K> previousNode = mover.getPreviousNode();
                Node<K> nextNode = mover.getNextNode();

                if (nextNode == null) {
                    // we are at tail of the linked list
                    previousNode.setNextNode(null);
                    break;
                }
                previousNode.setNextNode(nextNode);
                nextNode.setPreviousNode(previousNode);
                break;
            }
            mover = mover.getNextNode();
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        Node<K> mover = head;
        while (mover != null) {
            K data = mover.getData();
            sb.append(data);
            sb.append(mover.getNextNode() != null ? ", " : "");
            mover = mover.getNextNode();
        }
        sb.append("]");

        return sb.toString();
    }
}
