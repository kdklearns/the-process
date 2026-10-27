package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_10_design_hashmap;

public class MyHashMap {
    private Node[] bucket;

    public MyHashMap() {
        bucket = new Node[1000];
    }
    
    public void put(int key, int value) {
        int index = key % 1000;
        Node head = bucket[index];

        // no node exists yet for hashed index
        if (head == null) {
            bucket[index] = new Node(key, value);
            return;
        }

        while (head.nextNode != null) {
            // key already present
            if (head.key == key) {
                head.value = value;
                return;
            }
            head = head.nextNode;
        }

        // checking tail
        if (head.key == key) {
            head.value = value;
        } else {
            Node newNode = new Node(key, value);
            head.nextNode = newNode;
            newNode.previousNode = head;
        }
    }
    
    public int get(int key) {
        int value = -1;
        int index = key % 1000;
        Node head = bucket[index];

        while (head != null) {
            int nodeKey = head.key;
            if (nodeKey == key) {
                value = head.value;
                break;
            }
            head = head.nextNode;
        }

        return value;
    }
    
    public void remove(int key) {
        int index = key % 1000;
        Node head = bucket[index];

        // no node exists yet for hashed index
        if (head == null) {
            return;
        }

        // remove head
        if (head.key == key) {
            Node nextNode = head.nextNode;
            // head is also the tail, i.e. there is only one node in the chain
            if (nextNode == null) {
                bucket[index] = null;
            } else {
                bucket[index] = nextNode;
                nextNode.previousNode = null;
            }
            return;
        }

        while (head != null) {
            // de-link the node from chain
            if (head.key == key) {
                Node previousNode = head.previousNode;
                // node to be removed is the tail node
                if (head.nextNode == null) {
                    previousNode.nextNode = null;
                } else {
                    // in between chain node
                    Node nextNode = head.nextNode;
                    previousNode.nextNode = nextNode;
                    nextNode.previousNode = previousNode;
                }
                return;
            }
            head = head.nextNode;
        }
    }

    private static class Node {
        Node previousNode;
        int key;
        int value;
        Node nextNode;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
            previousNode = null;
            nextNode = null;
        }
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */