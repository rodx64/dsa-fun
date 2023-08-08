package dataStructures.tests;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static setup.Constants.*;
import static setup.dataStructures.ConsoleColors.*;
import static setup.dataStructures.tests.BigOFunctionsList.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BigOFunctionsListTest {

    static Map<Object, Long> addingMap;
    static Map<Object, Long> gettingMap;
    static Map<Object, Long> removingFirstMap;
    static Map<Object, Long> removingLastMap;
    static Map<Object, Long> removingMiddleMap;

    @BeforeAll
    static void setUp(){
        addingMap = addingMap();
        gettingMap = gettingMap();
        removingFirstMap = removingFirstMap();
        removingMiddleMap = removingMiddleMap();
        removingLastMap = removingLastMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: LIST TESTS :::" + RESET + "%n" );
    }

    private static void printFunctions() {
        addingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Adding", key, value));
        gettingMap.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Getting", key, value));
        removingFirstMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::First", key, value));
        removingMiddleMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Middle", key, value));
        removingLastMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Last", key, value));
    }

    private static void printFaster(){
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Adding", getFaster(addingMap).getKey(), getFaster(addingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Reading", getFaster(gettingMap).getKey(), getFaster(gettingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing First", getFaster(removingFirstMap).getKey(), getFaster(removingFirstMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Middle", getFaster(removingMiddleMap).getKey(), getFaster(removingMiddleMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Last", getFaster(removingLastMap).getKey(), getFaster(removingLastMap).getValue());
    }

    @Test
    @DisplayName("Adding - Validate that ArrayList is Faster")
    void whenAddingInList_shouldValidateThatArrayListIsFaster(){
        assertEquals(ArrayList.class.getSimpleName(), getFaster(addingMap).getKey());
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
}
