package org.kdklearns.data_structures.hashmap.using_arraylist;

public class Test {

    public static void main(String[] args) {
        MyHashMap<String, String> capitals = new MyHashMap<>();
        capitals.put("india", "delhi");
        capitals.put("ireland", "dublin");
        capitals.put("usa", "washington");
        capitals.put("usa", "washington d.c.");
        capitals.put(null, "gotcha");

        // Test
        System.out.println(capitals.get("india"));
        System.out.println(capitals.get("usa"));
        System.out.println(capitals.containsKey("ireland"));
        System.out.println(capitals.containsKey("samay"));
        System.out.println(capitals.get("travis"));
        System.out.println(capitals.get(null));
        System.out.println(capitals.size());
        System.out.println(capitals.containsKey(null));
    }
}
