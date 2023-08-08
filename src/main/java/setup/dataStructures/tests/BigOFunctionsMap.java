package setup.dataStructures.tests;

import setup.dataStructures.response.ResponseMap;

import java.util.*;

public class BigOFunctionsMap extends ResponseMap {

    public static Map<Object, Long> puttingMap() {
        puttingMapOn(hashMap);
        puttingMapOn(linkedHashMap);
        puttingMapOn(treeMap);
        return insertMap;
    }
    public static Map<Object, Long> gettingMap() {
        gettingMapOn(hashMap);
        gettingMapOn(linkedHashMap);
        gettingMapOn(treeMap);
        return readMap;
    }
    public static Map<Object, Long> removingMap() {
        removingMapOn(hashMap);
        removingMapOn(linkedHashMap);
        removingMapOn(treeMap);
        return deleteMap;
    }

    public static Map<Object, Long> containsMap() {
        containsMapOn(hashMap);
        containsMapOn(linkedHashMap);
        containsMapOn(treeMap);
        return containsMap;
    }

}
