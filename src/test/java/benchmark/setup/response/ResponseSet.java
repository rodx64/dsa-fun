package benchmark.setup.response;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import static benchmark.setup.Constants.MAX_SIZE;

public class ResponseSet extends Response {
    protected final static Set<Integer> hashSet = new HashSet<>();
    protected final static Set<Integer> treeSet = new TreeSet<>();
    protected final static Set<Integer> linkedHashSet = new LinkedHashSet<>();

    protected static void addingMapOn(Set<Integer> set) {
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            set.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        insertMap.put(set.getClass().getSimpleName(), duration);
    }

    protected static void removingMapOn(Set<Integer> set) {
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            set.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteMap.put(set.getClass().getSimpleName(), duration);
    }

    protected static void containsMapOn(Set<Integer> set) {
        startTime = System.nanoTime();
        set.contains(MAX_SIZE / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        containsMap.put(set.getClass().getSimpleName(), duration);
    }

    protected static void nextMapOn(Set<Integer> set) {
        final Iterator<Integer> iterator = set.iterator();
        startTime = System.nanoTime();
        iterator.next();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        nextMap.put(set.getClass().getSimpleName(), duration);
    }

}
