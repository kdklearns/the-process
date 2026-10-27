package org.kdklearns.data_structures.hashmap.using_doubly_linked_list;

public class MyHashMap<K, V> {
    private int size = 16;
    private Node<K, V>[] bucket;

    public MyHashMap() {
        bucket = new Node[size];
    }

    private int getIndex(K key) {
        int h = key == null ? 0 : key.hashCode();
        int hash = h ^ (h >>> 16);
        int index = hash & (size - 1);

        return index;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        // either at this index, we can have null present, or an existing Node head
        if (bucket[index] == null) {
            Node<K, V> head = new Node<>(key, value);
            bucket[index] = head;
            return;
        }

        Node<K, V> mover = bucket[index];
        // check head
        if (mover.getKey().equals(key)) {
            mover.setValue(value);
            return;
        }

        while (mover.getNextNode() != null) {
            K nodeKey = mover.getKey();
            // update if key already exists
            if (nodeKey.equals(key)) {
                mover.setValue(value);
                return;
            }
            mover = mover.getNextNode();
        }

        // mover is now at the tail of linked list
        Node<K, V> newNode = new Node<>(key, value);
        mover.setNextNode(newNode);
        newNode.setPreviousNode(mover);
    }

    public V get(K key) {
        int index = getIndex(key);
        if (bucket[index] == null) {
            return null;
        }

        Node<K, V> mover = bucket[index];
        V value = null;
        while (mover.getNextNode() != null) {
            if (mover.getKey().equals(key)) {
                value = mover.getValue();
                break;
            }
            mover = mover.getNextNode();
        }

        return value;
    }

    public boolean containsKey(K key) {
        int index = getIndex(key);
        if (bucket[index] == null) {
            return false;
        }

        Node<K, V> mover = bucket[index];
        while (mover != null) {
            if (mover.getKey().equals(key)) {
                return true;
            }
            mover = mover.getNextNode();
        }

        return false;
    }

    public V remove(K key) {
        V removedValue = null;
        int index = getIndex(key);
        if (bucket[index] == null) {
            return null;
        }

        Node<K, V> mover = bucket[index];
        // head removal
        if (mover.getKey().equals(key)) {
            removedValue = mover.getValue();
            Node<K, V> nextNode = mover.getNextNode();
            if (nextNode == null) {
                bucket[index] = null;
                return removedValue;
            }
            bucket[index] = nextNode;
            nextNode.setPreviousNode(null);
            return removedValue;
        }

        while (mover != null) {
            K nodeKey = mover.getKey();
            if (key.equals(nodeKey)) {
                removedValue = mover.getValue();
                Node<K, V> previousNode = mover.getPreviousNode();
                Node<K, V> nextNode = mover.getNextNode();

                // tail removal
                if (nextNode == null) {
                    previousNode.setNextNode(null);
                    break;
                }

                previousNode.setNextNode(nextNode);
                nextNode.setPreviousNode(previousNode);
                break;
            }
            mover = mover.getNextNode();
        }

        return removedValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (Node<K, V> head: bucket) {
            Node<K, V> mover = head;
            while (mover != null) {
                sb.append("{");
                sb.append(mover.getKey());
                sb.append(", ");
                sb.append(mover.getValue());
                sb.append("}, ");

                mover = mover.getNextNode();
            }
        }
        sb.append("]");

        return sb.toString();
    }
}
