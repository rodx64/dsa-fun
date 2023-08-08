package setup.dataStructures.tests;

import java.util.*;

public abstract class BigOFunctionsSet {

    public static void setTypes(){
        HashSet<Integer> hashSet = new HashSet<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        Random random = new Random();

        System.out.println("\n# ADD #");

        // HashSet add
        long startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(1000 - 10) + 10;
            hashSet.add(new Integer(x));
        }
        long endTime = System.nanoTime();
        long duration = (endTime - startTime) / 1000;
        System.out.println("HashSet: " + duration + " μs");


        // TreeSet add
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(1000 - 10) + 10;
            treeSet.add(new Integer(x));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("TreeSet: " + duration + " μs");


        // LinkedHashSet add
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            int x = random.nextInt(1000 - 10) + 10;
            linkedHashSet.add(new Integer(x));
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("LinkedHashSet: " + duration + " μs");


        System.out.println("\n# REMOVE #");

        // HashSet remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            hashSet.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("HashSet: " + duration + " μs");


        // TreeSet remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            treeSet.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("TreeSet: " + duration + " μs");


        // LinkedHashSet remove
        startTime = System.nanoTime();
        for (int i = 0; i < 1000; i++) {
            linkedHashSet.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        System.out.println("LinkedHashSet: " + duration + " μs");
    }
}
