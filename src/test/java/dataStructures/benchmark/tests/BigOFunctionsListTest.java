package dataStructures.benchmark.tests;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static setup.dataStructures.benchmark.Constants.*;
import static setup.dataStructures.benchmark.ConsoleColors.*;
import static setup.dataStructures.benchmark.tests.BigOFunctionsList.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BigOFunctionsListTest {

    static Map<Object, Long> appendingMap;
    static Map<Object, Long> prependingMap;
    static Map<Object, Long> gettingMap;
    static Map<Object, Long> removingFirstMap;
    static Map<Object, Long> removingLastMap;
    static Map<Object, Long> removingMiddleMap;

    @BeforeAll
    static void setUp(){
        appendingMap = addingMap();
        prependingMap = addingFirstMap();
        gettingMap = gettingMap();
        removingFirstMap = removingFirstMap();
        removingMiddleMap = removingMiddleMap();
        removingLastMap = removingLastMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    @AfterAll
    static void cleaningUp(){
        clear();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: LIST TESTS :::" + RESET + "%n" );
    }

    private static void printFunctions() {
        appendingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Adding", key, value));
        prependingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Adding First", key, value));
        gettingMap.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Getting", key, value));
        removingFirstMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::First", key, value));
        removingMiddleMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Middle", key, value));
        removingLastMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Last", key, value));
    }

    private static void printFaster(){
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Adding", getFaster(appendingMap).getKey(), getFaster(appendingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Adding First", getFaster(prependingMap).getKey(), getFaster(prependingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Reading", getFaster(gettingMap).getKey(), getFaster(gettingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing First", getFaster(removingFirstMap).getKey(), getFaster(removingFirstMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Middle", getFaster(removingMiddleMap).getKey(), getFaster(removingMiddleMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Last", getFaster(removingLastMap).getKey(), getFaster(removingLastMap).getValue());
    }

    @Test
    @DisplayName("Adding - Validate that LinkedList is Faster adding in First")
    void whenAddingInFirstPositionList_shouldValidateThatLinkedListIsFaster(){
        assertEquals(LinkedList.class.getSimpleName(), getFaster(prependingMap).getKey());
    }

    @Test
    @DisplayName("Getting - Validate that ArrayList is Faster")
    void whenGettingInList_shouldValidateThatArrayListIsFaster(){
        assertEquals(ArrayList.class.getSimpleName(), getFaster(gettingMap).getKey());
    }

    @Test
    @DisplayName("Removing First - Validate that LinkedList is Faster")
    void whenRemovingFirstInList_shouldValidateThatLinkedListIsFaster(){
        assertEquals(LinkedList.class.getSimpleName(), getFaster(removingFirstMap).getKey());
    }

    @Test
    @DisplayName("Removing Last - Validate that ArrayList is Faster")
    void whenRemovingLastInList_shouldValidateThatLinkedListIsFaster(){
        assertEquals(ArrayList.class.getSimpleName(), getFaster(removingLastMap).getKey());
    }

    @Test
    @DisplayName("Removing Middle - Validate that ArrayList is Faster")
    void whenRemovingMiddleInList_shouldValidateThatLinkedListIsFaster(){
        assertEquals(ArrayList.class.getSimpleName(), getFaster(removingMiddleMap).getKey());
    }

    private static void clear() {
        prependingMap.clear();
        gettingMap.clear();
        removingFirstMap.clear();
        removingMiddleMap.clear();
        removingLastMap().clear();
    }
}
