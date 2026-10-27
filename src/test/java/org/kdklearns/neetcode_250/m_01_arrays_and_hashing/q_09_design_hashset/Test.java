package org.kdklearns.neetcode_250.m_01_arrays_and_hashing.q_09_design_hashset;

public class Test {

    public static void main(String[] args) {
        MyHashSet set = new MyHashSet();

        // add
        set.add(12);
        set.add(10);
        set.add(12);
        set.add(14);
        System.out.println(set);

        // remove
        set.remove(12);
        System.out.println(set);

        // contains
        System.out.println(set.contains(10) + ", " + set.contains(12));

        // size
        System.out.println(set.size());
    }
}
