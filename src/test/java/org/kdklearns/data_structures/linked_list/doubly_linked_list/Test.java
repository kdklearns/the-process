package org.kdklearns.data_structures.linked_list.doubly_linked_list;

public class Test {

    public static void main(String[] args) {
        MyDoublyLinkedList<Integer> list = new MyDoublyLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        System.out.println(list);
        list.remove(1);
        list.remove(6);
        list.remove(2);
        list.remove(4);
        System.out.println(list);

        MyDoublyLinkedList<Integer> list2 = new MyDoublyLinkedList();
        System.out.println(list2);
    }
}
