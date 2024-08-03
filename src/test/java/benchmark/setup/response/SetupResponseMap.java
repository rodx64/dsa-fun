package benchmark.setup.response;

import java.util.Map;

public class SetupResponseMap extends ResponseMap {

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
        return readMapByIndex;
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
