package Basic;

import java.util.Map;
import java.util.Set;

public class HashMap {

    public static void main(String[] args) {
        Map<Integer, Integer> map = new java.util.HashMap<>();
        map.put(1, 1);
        map.put(2, 1);
        System.out.println(map);
        Map<Integer, String> hm = new java.util.HashMap<>();
        hm.put(1, "Geeks");
        hm.put(2, "Geeks");
        hm.put(3, "Geeks");
        hm.put(4, "Geeks");
        System.out.println("Initial Map " + hm);
        hm.put(2, "for");
        System.out.println("Updated Map" + hm);

        hm.remove(4);

        System.out.println("Removed Element " + hm);

        // Traversal The HashMap
        Map<String, Integer> hashMap = new java.util.HashMap<>();
        hashMap.put("vishal", 10);
        hashMap.put("sachin", 30);
        hashMap.put("vaibhav", 20);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey()+"  "+entry.getValue());
        }


    }
}
