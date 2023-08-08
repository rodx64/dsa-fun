package setup.dataStructures.response;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static setup.Constants.MAX_SIZE;

public class ResponseList extends Response {

    protected final static List<Integer> arrayList = new ArrayList<>();
    protected final static List<Integer> linkedList = new LinkedList<>();

    protected static void putOnAddList(List<Integer> list){
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        insertMap.put(list.getClass().getSimpleName(), duration);
    }

    protected static void putOnGetList(List<Integer> list){
        startTime = System.nanoTime();
        for (int i = 0; i < MAX_SIZE; i++) {
            list.get(i);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        readMap.put(list.getClass().getSimpleName(), duration);
    }

   protected static void putOnRemoveFirstList(List<Integer> list){
        startTime = System.nanoTime();
        list.remove(0);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteFirstMap.put(list.getClass().getSimpleName(), duration);
    }

    protected static void putOnRemoveLastList(List<Integer> list){
        int last = list.size() - 1;
        if(list instanceof LinkedList){
            startTime = System.nanoTime();
            ((LinkedList<Integer>) list).removeLast();
        } else {
            startTime = System.nanoTime();
            list.remove(last);
        }
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteLastMap.put(list.getClass().getSimpleName(), duration);
    }

    protected static void putOnRemoveMiddleList(List<Integer> list){
        startTime = System.nanoTime();
        list.remove(MAX_SIZE / 2);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteMiddleMap.put(list.getClass().getSimpleName(), duration);
    }
}
