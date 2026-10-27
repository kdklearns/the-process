package org.kdklearns.data_structures.hashmap.using_doubly_linked_list;

public class Test {

    public static void main(String[] args) {
        MyHashMap<String, String> capitals = new MyHashMap<>();
        // Add or Update
        capitals.put("india", "delhi");
        capitals.put("china", "snake");
        capitals.put("china", "beijing");
        capitals.put("usa", "washington");
        capitals.put("nepal", "poty");
        capitals.put("nepal", "kathmandu");
        System.out.println(capitals);

        // Contains check
        System.out.println(capitals.containsKey("china"));

        // Remove
        String removed = capitals.remove("china");
        System.out.println("Removed: \"" + removed + "\", HashMap: " + capitals);
        System.out.println(capitals.containsKey("china"));
        capitals.remove("usa"); capitals.remove("nepal"); capitals.remove("india");
        capitals.containsKey("test");
        System.out.println(capitals);
    }
}
