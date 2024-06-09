package dataStructures.benchmark.tests;

import org.junit.jupiter.api.*;

import java.util.*;

import static benchmark.tests.BigOFunctionsSet.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static benchmark.Constants.*;
import static benchmark.ConsoleColors.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class BigOFunctionsSetTest {

    static Map<Object, Long> addingMap;
    static Map<Object, Long> removingMap;
    static Map<Object, Long> containsMap;
    static Map<Object, Long> nextMap;

    @BeforeAll
    static void setUp(){
        addingMap = addingMap();
        containsMap = containsMap();
        nextMap = nextMap();
        removingMap = removingMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    @AfterAll
    static void cleaningUp(){
        clear();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: SET TESTS :::" + RESET + "%n" );
    }

    private static void printFunctions() {
        addingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Adding", key, value));
        containsMap.forEach((key, value) -> System.out.printf((MESSAGE_CONTAINS_COLOR) + "%n", "Contains", key, value));
        nextMap.forEach((key, value) -> System.out.printf((MESSAGE_NEXT_COLOR) + "%n", "Finding Next", key, value));
        removingMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing", key, value));
    }

    private static void printFaster(){
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Adding", getFaster(addingMap).getKey(), getFaster(addingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Contains", getFaster(containsMap).getKey(), getFaster(containsMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Finding Next", getFaster(nextMap).getKey(), getFaster(nextMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing", getFaster(removingMap).getKey(), getFaster(removingMap).getValue());
    }

    @Test
    @DisplayName("Adding - Validate that TreeSet is Slower than HashSet/LinkedHashSet")
    void whenAddingInSet_shouldValidateThatTreeSetIsSlower(){
        assertEquals(TreeSet.class.getSimpleName(), getSlower(addingMap).getKey());
    }

    @Test
    @DisplayName("Contains - Validate that LinkedHashSet is Faster")
    void whenContainsSet_shouldValidateThatLinkedHashSetIsFaster(){
        assertEquals(LinkedHashSet.class.getSimpleName(), getFaster(containsMap).getKey());
    }

    @Test
    @DisplayName("Finding Next - Validate that LinkedHashSet is Faster")
    void whenindingNextSet_shouldValidateThatLinkedHashSetIsFaster(){
        assertEquals(LinkedHashSet.class.getSimpleName(), getFaster(nextMap).getKey());
    }

    @Test
    @DisplayName("Removing - Validate that TreeSet is Slower than HashSet/LinkedHashSet")
    void whenRemovingInSet_shouldValidateThatTreeSetIsSlower(){
        assertEquals(TreeSet.class.getSimpleName(), getSlower(removingMap).getKey());
    }

    private static void clear() {
        addingMap.clear();
        containsMap.clear();
        nextMap.clear();
        removingMap.clear();
    }

}
