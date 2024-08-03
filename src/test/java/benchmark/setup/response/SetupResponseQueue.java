package benchmark.setup.response;

import java.util.Map;

public abstract class SetupResponseQueue extends ResponseQueue {

    public static Map<Object, Long> addingMap() {
        offerMapOn(arrayDeque);
        offerMapOn(priorityQueue);
        return insertMap;
    }
    public static Map<Object, Long> readFirst() {
        peekMapOn(arrayDeque);
        peekMapOn(priorityQueue);
        return readMapByIndex;
    }

    public static Map<Object, Long> removingHeadMap() {
        pollMapOn(arrayDeque);
        pollMapOn(priorityQueue);
        return deleteFirstMap;
    }

    public static Map<Object, Long> removingMap() {
        removingMapOn(arrayDeque);
        removingMapOn(priorityQueue);
        return deleteMap;
    }

}
