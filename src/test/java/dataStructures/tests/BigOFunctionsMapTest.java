package dataStructures.tests;

import org.junit.jupiter.api.*;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static setup.Constants.*;
import static setup.dataStructures.ConsoleColors.*;
import static setup.dataStructures.tests.BigOFunctionsMap.*;

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
    @DisplayName("Putting - Validate that LinkedHashMap is Faster")
    void whenPuttingInMap_shouldValidateThatLinkedHashMapIsFaster(){
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(addingMap).getKey());
    }
    @Test
    @DisplayName("Reading - Validate that LinkedHashMap is Faster")
    void whenReadingInMap_shouldValidateThatLinkedHashMapIsFaster(){
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(gettingMap).getKey());
    }
    @Test
    @DisplayName("Removing - Validate that HashMap is Faster")
    void whenRemovingInMap_shouldValidateThatHashMapIsFaster(){
        assertEquals(HashMap.class.getSimpleName(), getFaster(removingMap).getKey());
    }

    @Test
    @DisplayName("Contains - Validate that LinkedHashMap is Faster")
    void whenContainsMap_shouldValidateThatLinkedHashMapIsFaster(){
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(containsMap).getKey());
    }

}
