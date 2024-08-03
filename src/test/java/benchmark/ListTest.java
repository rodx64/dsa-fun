package benchmark;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;

import static benchmark.setup.ConsoleColors.RESET;
import static benchmark.setup.ConsoleColors.WHITE_BRIGHT;
import static benchmark.setup.Constants.MESSAGE_ADDING_COLOR;
import static benchmark.setup.Constants.MESSAGE_FASTER_COLOR;
import static benchmark.setup.Constants.MESSAGE_READING_COLOR;
import static benchmark.setup.Constants.MESSAGE_REMOVING_COLOR;
import static benchmark.setup.response.Response.getFaster;
import static benchmark.setup.response.SetupResponseList.addingFirstMap;
import static benchmark.setup.response.SetupResponseList.addingMap;
import static benchmark.setup.response.SetupResponseList.lookingByIndex;
import static benchmark.setup.response.SetupResponseList.lookingByValue;
import static benchmark.setup.response.SetupResponseList.removingFirstMap;
import static benchmark.setup.response.SetupResponseList.removingLastMap;
import static benchmark.setup.response.SetupResponseList.removingMiddleMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
class ListTest {

    static Map<Object, Long> appendingMap;
    static Map<Object, Long> prependingMap;
    static Map<Object, Long> lookingMapByIndex;
    static Map<Object, Long> lookingMapByValue;
    static Map<Object, Long> removingFirstMap;
    static Map<Object, Long> removingLastMap;
    static Map<Object, Long> removingMiddleMap;

    @BeforeAll
    static void setUp() {
        appendingMap = addingMap();
        prependingMap = addingFirstMap();
        lookingMapByIndex = lookingByIndex();
        lookingMapByValue = lookingByValue();
        removingFirstMap = removingFirstMap();
        removingMiddleMap = removingMiddleMap();
        removingLastMap = removingLastMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    @AfterAll
    static void cleaningUp() {
        clear();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: LIST TESTS :::" + RESET + "%n");
    }

    private static void printFunctions() {
        appendingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Appending", key, value));
        prependingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Prepending", key, value));
        lookingMapByIndex.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Looking by Index", key, value));
        lookingMapByValue.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Looking by Value", key, value));
        removingFirstMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::First", key, value));
        removingMiddleMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Middle", key, value));
        removingLastMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing::Last", key, value));
    }

    private static void printFaster() {
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Appending", getFaster(appendingMap).getKey(), getFaster(appendingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Prepending", getFaster(prependingMap).getKey(), getFaster(prependingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Looking by Index", getFaster(lookingMapByIndex).getKey(), getFaster(lookingMapByIndex).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Looking by Value", getFaster(lookingMapByValue).getKey(), getFaster(lookingMapByValue).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing First", getFaster(removingFirstMap).getKey(), getFaster(removingFirstMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Middle", getFaster(removingMiddleMap).getKey(), getFaster(removingMiddleMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing Last", getFaster(removingLastMap).getKey(), getFaster(removingLastMap).getValue());
    }

    @Test
    @DisplayName("Adding - Validate that LinkedList is Faster adding in First")
    void whenAddingInFirstPositionList_shouldValidateThatLinkedListIsFaster() {
        assertEquals(LinkedList.class.getSimpleName(), getFaster(prependingMap).getKey());
    }

    @Test
    @DisplayName("Looking By Index - Validate that ArrayList is Faster")
    void whenGettingInList_shouldValidateThatArrayListIsFaster() {
        assertEquals(ArrayList.class.getSimpleName(), getFaster(lookingMapByIndex).getKey());
    }

    @Test
    @DisplayName("Removing First - Validate that LinkedList is Faster")
    void whenRemovingFirstInList_shouldValidateThatLinkedListIsFaster() {
        assertEquals(LinkedList.class.getSimpleName(), getFaster(removingFirstMap).getKey());
    }

    @Test
    @DisplayName("Removing Last - Validate that ArrayList is Faster")
    void whenRemovingLastInList_shouldValidateThatLinkedListIsFaster() {
        assertEquals(ArrayList.class.getSimpleName(), getFaster(removingLastMap).getKey());
    }

    @Test
    @DisplayName("Removing Middle - Validate that ArrayList is Faster")
    void whenRemovingMiddleInList_shouldValidateThatLinkedListIsFaster() {
        assertEquals(ArrayList.class.getSimpleName(), getFaster(removingMiddleMap).getKey());
    }

    private static void clear() {
        prependingMap.clear();
        lookingMapByIndex.clear();
        lookingMapByValue.clear();
        removingFirstMap.clear();
        removingMiddleMap.clear();
        removingLastMap().clear();
        Runtime runtime = Runtime.getRuntime();
        runtime.gc();

    }
}
