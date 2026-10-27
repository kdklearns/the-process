package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_09_design_hashset;

/**
 * Time Complexity for add, contains and remove
 * Best Case - O(1)
 * Average, assuming uniform hashing, O(1 + N/16) - O(N)
 * Worst Case - O(N)
 *
 * Space Complexity - O(N)
 */

public class MyHashSet {
    private MyHashMap<Integer, Boolean> map;

    public MyHashSet() {
        map = new MyHashMap<>();
    }
    
    public void add(int key) {
        map.put(key, true);
    }
    
    public void remove(int key) {
        map.remove(key);
    }
    
    public boolean contains(int key) {
        return map.containsKey(key);
    }

    private static class MyHashMap<K, V> {
        private int length = 0; // not part of submitted solution
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
                // insert a new node
                Node<K, V> head = new Node<>(key, value);
                bucket[index] = head;
                length++; // not part of submitted solution
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
            // check tail for duplicate
            if (mover.key.equals(key)) {
                mover.value = value;
                return;
            }

            // insert a new node
            Node<K, V> newNode = new Node<>(key, value);
            mover.setNextNode(newNode);
            newNode.setPreviousNode(mover);
            length++; // not part of submitted solution
        }

        public V get(K key) {
            int index = getIndex(key);
            if (bucket[index] == null) {
                return null;
            }

            Node<K, V> mover = bucket[index];
            V value = null;
            while (mover != null) {
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

                // if head is the tail as well
                if (nextNode == null) {
                    bucket[index] = null;
                    length--; // not part of submitted solution
                    return removedValue;
                }

                bucket[index] = nextNode;
                nextNode.setPreviousNode(null);
                length--; // not part of submitted solution
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
                        length--; // not part of submitted solution
                        break;
                    }

                    previousNode.setNextNode(nextNode);
                    nextNode.setPreviousNode(previousNode);
                    length--; // not part of submitted solution
                    break;
                }
                mover = mover.getNextNode();
            }

            return removedValue;
        }

        // not part of submitted solution
        @Override
        public String toString() {
            int count = 1;
            StringBuilder sb = new StringBuilder();
            sb.append("[");

            for (Node<K, V> head: bucket) {
                Node<K, V> mover = head;
                while (mover != null) {
                    sb.append("{");
                    sb.append(mover.getKey());
                    sb.append(", ");
                    sb.append(mover.getValue());
                    sb.append(count != length ? "}, " : "}");

                    mover = mover.getNextNode();
                    count++;
                }
            }
            sb.append("]");

            return sb.toString();
        }
    }

    private static class Node<K, V> {
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

    public int size() {
        return map.length;
    }

    // Not part of submitted solution
    @Override
    public String toString() {
        int count = 1;
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node<Integer, Boolean> head: map.bucket) {
            while (head != null) {
                sb.append(head.key);
                sb.append(count != map.length ? ", " : "");
                head = head.nextNode;
                count++;
            }
        }
        sb.append("]");
        return sb.toString();
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */