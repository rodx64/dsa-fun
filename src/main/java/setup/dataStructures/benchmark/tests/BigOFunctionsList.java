package setup.dataStructures.benchmark.tests;

import setup.dataStructures.benchmark.response.ResponseList;

import java.util.Map;

public class BigOFunctionsList extends ResponseList {

    public static Map<Object, Long> addingMap(){
        putOnAddList(arrayList);
        putOnAddList(linkedList);
        return insertMap;
    }
    public static Map<Object, Long> addingFirstMap(){
        putOnFirstPositionList(arrayList);
        putOnFirstPositionList(linkedList);
        return insertFirstMap;
    }
    public static Map<Object, Long> gettingMap(){
        putOnGetList(arrayList);
        putOnGetList(linkedList);
        return readMap;
    }
    public static Map<Object, Long> removingFirstMap(){
        putOnRemoveFirstList(arrayList);
        putOnRemoveFirstList(linkedList);
        return deleteFirstMap;
    }
    public static Map<Object, Long> removingLastMap(){
        putOnRemoveLastList(arrayList);
        putOnRemoveLastList(linkedList);
        return deleteLastMap;
    }
    public static Map<Object, Long> removingMiddleMap(){
        putOnRemoveMiddleList(arrayList);
        putOnRemoveMiddleList(linkedList);
        return deleteMiddleMap;
    }
}


