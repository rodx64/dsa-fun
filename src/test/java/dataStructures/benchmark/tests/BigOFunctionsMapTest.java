package dataStructures.benchmark.tests;

import org.junit.jupiter.api.*;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static benchmark.tests.BigOFunctionsMap.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static benchmark.Constants.*;
import static benchmark.ConsoleColors.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BigOFunctionsMapTest {

    static Map<Object, Long> addingMap;
    static Map<Object, Long> gettingMap;
    static Map<Object, Long> removingMap;
    static Map<Object, Long> containsMap;

    @BeforeAll
    static void setUp(){
        addingMap = puttingMap();
        gettingMap = gettingMap();
        removingMap = removingMap();
        containsMap = containsMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    @AfterAll
    static void cleaningUp(){
        clear();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: MAP TESTS :::" + RESET + "%n" );
    }

    private static void printFunctions() {
        addingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Putting", key, value));
        gettingMap.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Reading", key, value));
        removingMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing", key, value));
        containsMap.forEach((key, value) -> System.out.printf((MESSAGE_CONTAINS_COLOR) + "%n", "Contains", key, value));
    }

    private static void printFaster(){
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Putting", getFaster(addingMap).getKey(), getFaster(addingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Reading", getFaster(gettingMap).getKey(), getFaster(gettingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing", getFaster(removingMap).getKey(), getFaster(removingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Contains", getFaster(containsMap).getKey(), getFaster(containsMap).getValue());
    }

    @Test
    @DisplayName("Reading - Validate that LinkedHashMap is Faster")
    void whenReadingInMap_shouldValidateThatLinkedHashMapIsFaster(){
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(gettingMap).getKey());
    }
    @Test
    @DisplayName("Removing - Validate that TreeMap is Slower than HashMap/LinkedHashMap")
    void whenRemovingInMap_shouldValidateThatTreeMapIsSlower(){
        assertEquals(TreeMap.class.getSimpleName(), getSlower(removingMap).getKey());
    }

    @Test
    @DisplayName("Contains - Validate that LinkedHashMap is Faster")
    void whenContainsMap_shouldValidateThatLinkedHashMapIsFaster(){
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(containsMap).getKey());
    }

    private static void clear() {
        addingMap.clear();
        gettingMap.clear();
        containsMap.clear();
        removingMap.clear();
    }
}
