package dataStructures.tests;

import java.util.*;

public abstract class BigOFunctionsMap {

    public static void mapTypes(){
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        System.out.println("\n# ADD #");

        // HashMap put
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.put(new Integer(i), "Test" + i);
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000;
        System.out.println("HashMap: " + duration + " μs");


        // TreeMap put
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.put(new Integer(i), "Test" + i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("TreeMap: " + duration + " μs");


        // LinkedHashMap put
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashMap.put(new Integer(i), "Test" + i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("LinkedHashMap: " + duration + " μs");


        System.out.println("\n# REMOVE #");

        // HashMap remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashMap.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("HashMap: " + duration + " μs");


        // TreeMap remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeMap.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("TreeMap: " + duration + " μs");


        // LinkedHashMap remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashMap.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("LinkedHashMap: " + duration + " μs");
    }

}
