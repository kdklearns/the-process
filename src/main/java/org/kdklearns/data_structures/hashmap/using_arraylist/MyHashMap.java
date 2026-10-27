package org.kdklearns.data_structures.hashmap.using_arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public final class MyHashMap<K, V> {
    private int capacity;
    private int length;
    private ArrayList<Node<K, V>>[] bucket;

    public MyHashMap() {
        capacity = 16;
        length = 0;
        bucket = new ArrayList[16];
    }

    private int calculateHash(K key) {
        int h = key == null ? 0 : key.hashCode();
        int hash = h ^ (h >>> 16);
        int index = hash & (capacity - 1);
        return index;
    }

    public void put(K key, V value) {
        int index = calculateHash(key);

        //check whether that bucket is currently empty
        if (bucket[index] == null) {
            // initialize the bucket and insert the node element
            bucket[index] = new ArrayList<>();
            Node<K, V> node = new Node<>(key, value);
            bucket[index].add(node);
            length++;
            return;
        }

        // Update existing value and return
        Iterator iterator = bucket[index].iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = (Node<K, V>) iterator.next();
            // update key with new value
            if (node.getKey().equals(key)) {
                node.setValue(value);
                return;
            }
        }

        // Insert new value
        Node<K, V> node = new Node<>(key, value);
        bucket[index].add(node);
        length++;
    }

    public V get(K key) {
        V value = null;

        // null key
        if (key == null) {
            if (bucket[0] == null) {
                return null;
            }
            Iterator iterator = bucket[0].iterator();
            while (iterator.hasNext()) {
                Node<K, V> node = (Node<K, V>) iterator.next();
                if (node.getKey() == null) {
                    return node.getValue();
                }
            }
        }

        int index = calculateHash(key);
        if (bucket[index] == null) {
            return value;
        }

        Iterator iterator = bucket[index].iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = (Node<K, V>) iterator.next();
            if (node.getKey().equals(key)) {
                value = node.getValue();
                break;
            }
        }
        return value;
    }

    public boolean containsKey(K key) {
        int index = calculateHash(key);
        if (bucket[index] == null) {
            return false;
        }

        // null key
        if (key == null) {
            Iterator iterator = bucket[index].iterator();
            while (iterator.hasNext()) {
                Node<K, V> node = (Node<K, V>) iterator.next();
                if (node.getKey() == null) {
                    return true;
                }
            }
            return false;
        }

        Iterator iterator = bucket[index].iterator();
        while (iterator.hasNext()) {
            Node<K, V> node = (Node<K, V>) iterator.next();
            if (node.getKey().equals(key)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        return length;
    }
}
