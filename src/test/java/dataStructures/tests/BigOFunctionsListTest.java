package dataStructures.tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static dataStructures.tests.BigOFunctionsList.*;

class BigOFunctionsListTest {

    static Map<Object, Long> addingMap;
    static Map<Object, Long> gettingMap;
    static Map<Object, Long> removingMap;

    @BeforeAll
    static void setUp(){
        addingMap = addingMap();
        gettingMap = gettingMap();
        removingMap = removingMap();
    }

    @Test
    @DisplayName("ADD LIST")
    void getAddMapTest() {
        addingMap.forEach((key, value) -> System.out.println(key + "=" + value + " μs"));
    }

    @Test
    @DisplayName("GET LIST")
    void getGettingMapTest() {
        gettingMap.forEach((key, value) -> System.out.println(key + "=" + value + " μs"));
    }

    @Test
    @DisplayName("REMOVE LIST")
    void getRemovingMapTest() {
        removingMap.forEach((key, value) -> System.out.println(key + "=" + value + " μs"));
    }

    @Test
    @DisplayName("FASTER ADDING")
    void whenComparingLists_mustReturnArrayAddingListAsFaster(){
        System.out.println("FASTER ADDING " + getFaster(addingMap) + " μs");
    }

    @Test
    @DisplayName("FASTER GETTING")
    void whenComparingLists_mustReturnArrayGettingListAsFaster(){
        System.out.println("FASTER GETTING " + getFaster(getMap) + " μs");
    }

    @Test
    @DisplayName("FASTER REMOVING")
    void whenComparingLists_mustReturnArrayRemovingListAsFaster(){
        System.out.println("FASTER REMOVING " + getFaster(removeMap) + " μs");
    }
}
