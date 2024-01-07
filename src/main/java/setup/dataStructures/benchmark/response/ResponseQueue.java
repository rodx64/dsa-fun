package setup.dataStructures.benchmark.response;

import java.util.*;

import static setup.dataStructures.benchmark.Constants.MAX_SIZE;

public class ResponseQueue extends Response {

    protected final static Queue<Integer> arrayDeque = new ArrayDeque<>();
    protected final static Queue<Integer> priorityQueue = new PriorityQueue<>();

    protected static void offerMapOn(Queue<Integer> queue) {
        startTime = System.nanoTime();
        queue.offer(MAX_SIZE);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        insertMap.put(queue.getClass().getSimpleName(), duration);
    }

    protected static void peekMapOn(Queue<Integer> queue) {
        startTime = System.nanoTime();
        queue.peek();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        readMapByIndex.put(queue.getClass().getSimpleName(), duration);
    }

    protected static void pollMapOn(Queue<Integer> queue) {
        final Iterator<Integer> iterator = queue.iterator();
        startTime = System.nanoTime();
        queue.poll();
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteFirstMap.put(queue.getClass().getSimpleName(), duration);
    }

    protected static void removingMapOn(Queue<Integer> queue) {
        Random rand = new Random();
        int randomNum = rand.nextInt((MAX_SIZE - 1) + 1) + 1;
        startTime = System.nanoTime();
        queue.remove(randomNum);
        endTime = System.nanoTime();
        duration = (endTime - startTime);
        deleteMap.put(queue.getClass().getSimpleName(), duration);
    }

}
