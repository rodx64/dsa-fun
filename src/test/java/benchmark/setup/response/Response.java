package benchmark.setup.response;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public abstract class Response {
    protected static long startTime = 0;
    protected static long endTime = 0;
    protected static long duration = 0;
    protected final static Map<Object, Long> insertMap = new HashMap<>();
    protected final static Map<Object, Long> insertFirstMap = new HashMap<>();
    protected final static Map<Object, Long> readMapByIndex = new HashMap<>();
    protected final static Map<Object, Long> readMapByValue = new HashMap<>();
    protected final static Map<Object, Long> deleteMap = new HashMap<>();
    protected final static Map<Object, Long> deleteFirstMap = new HashMap<>();
    protected final static Map<Object, Long> deleteLastMap = new HashMap<>();
    protected final static Map<Object, Long> deleteMiddleMap = new HashMap<>();
    protected final static Map<Object, Long> containsMap = new HashMap<>();
    protected final static Map<Object, Long> nextMap = new HashMap<>();

    public static Map.Entry<Object, Long> getFaster(Map<Object, Long> map) {
        return Collections.min(map.entrySet(), Map.Entry.comparingByValue());
    }

    public static Map.Entry<Object, Long> getSlower(Map<Object, Long> map) {
        return Collections.max(map.entrySet(), Map.Entry.comparingByValue());
    }
}
