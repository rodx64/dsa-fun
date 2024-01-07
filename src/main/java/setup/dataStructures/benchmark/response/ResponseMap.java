package setup.dataStructures.benchmark.response;

import java.util.*;

import static setup.dataStructures.benchmark.Constants.MAX_SIZE;

public class ResponseMap extends Response {

    protected final static Map<Integer, String> hashMap = new HashMap<>();
    protected final static Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
    protected final static Map<Integer, String> treeMap = new TreeMap<>();

    protected static void puttingMapOn(Map<Integer, String> map) {
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            map.put(i, "Test" + i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        insertMap.put(map.getClass().getSimpleName(), duration);
    }

    protected static void gettingMapOn(Map<Integer, String> map) {
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            map.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        readMapByIndex.put(map.getClass().getSimpleName(), duration);
    }

    protected static void removingMapOn(Map<Integer, String> map) {
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            map.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteMap.put(map.getClass().getSimpleName(), duration);
    }

    protected static void containsMapOn(Map<Integer, String> map) {
        startTime = System.nanoTime();
        map.containsKey(MAX_SIZE / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        containsMap.put(map.getClass().getSimpleName(), duration);
    }

}
