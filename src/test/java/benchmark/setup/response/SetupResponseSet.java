package benchmark.setup.response;

import java.util.Map;

public abstract class SetupResponseSet extends ResponseSet {

    public static Map<Object, Long> addingMap() {
        addingMapOn(hashSet);
        addingMapOn(linkedHashSet);
        addingMapOn(treeSet);
        return insertMap;
    }

    public static Map<Object, Long> removingMap() {
        removingMapOn(hashSet);
        removingMapOn(linkedHashSet);
        removingMapOn(treeSet);
        return deleteMap;
    }

    public static Map<Object, Long> containsMap() {
        containsMapOn(hashSet);
        containsMapOn(linkedHashSet);
        containsMapOn(treeSet);
        return containsMap;
    }

    public static Map<Object, Long> nextMap() {
        nextMapOn(hashSet);
        nextMapOn(linkedHashSet);
        nextMapOn(treeSet);
        return nextMap;
    }

}
