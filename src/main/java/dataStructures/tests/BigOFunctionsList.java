package dataStructures.tests;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public abstract class BigOFunctionsList {

    public static final int MAX_SIZE = 10000;
    static List<Integer> arrayList = new ArrayList<>();
    static List<Integer> linkedList = new LinkedList<>();
    static List<Integer> copyOnWriteArrayList = new CopyOnWriteArrayList<>();
    static Map<Object, Long> addMap = new HashMap<>();
    static Map<Object, Long> getMap = new HashMap<>();
    static Map<Object, Long> removeMap = new HashMap<>();
    static long startTime = 0;
    static long endTime = 0;
    static long duration = 0;

    static Map<Object, Long> addingMap(){
        putOnAddList(arrayList);
        putOnAddList(linkedList);
        putOnAddList(copyOnWriteArrayList);
        return addMap;
    }

    static Map<Object, Long> gettingMap(){
        putOnGetList(arrayList);
        putOnGetList(linkedList);
        putOnGetList(copyOnWriteArrayList);
        return getMap;
    }

    static Map<Object, Long> removingMap(){
        putOnRemoveList(arrayList);
        putOnRemoveList(linkedList);
        putOnRemoveList(copyOnWriteArrayList);
        return removeMap;
    }

    static void putOnAddList(List<Integer> list){
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        addMap.put(list.getClass(), duration);
    }

    static void putOnGetList(List<Integer> list){
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        getMap.put(list.getClass(), duration);
    }

    static void putOnRemoveList(List<Integer> list){
        startTime = System.nanoTime();
        for (int i = 10; i >= 0; i--) {
            list.remove(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime) / 1000;
        removeMap.put(list.getClass(), duration);
    }

    static Map.Entry<Object, Long> getFaster(Map<Object, Long> map) {
       return Collections.min(map.entrySet(), Map.Entry.comparingByValue());
    }

    static Map.Entry<Object, Long> getSlower(Map<Object, Long> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue());
    }
}


