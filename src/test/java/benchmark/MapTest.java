package benchmark;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import static benchmark.setup.ConsoleColors.RESET;
import static benchmark.setup.ConsoleColors.WHITE_BRIGHT;
import static benchmark.setup.Constants.MESSAGE_ADDING_COLOR;
import static benchmark.setup.Constants.MESSAGE_CONTAINS_COLOR;
import static benchmark.setup.Constants.MESSAGE_FASTER_COLOR;
import static benchmark.setup.Constants.MESSAGE_READING_COLOR;
import static benchmark.setup.Constants.MESSAGE_REMOVING_COLOR;
import static benchmark.setup.response.SetupResponseMap.containsMap;
import static benchmark.setup.response.SetupResponseMap.getFaster;
import static benchmark.setup.response.SetupResponseMap.getSlower;
import static benchmark.setup.response.SetupResponseMap.gettingMap;
import static benchmark.setup.response.SetupResponseMap.puttingMap;
import static benchmark.setup.response.SetupResponseMap.removingMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.MethodName.class)
class MapTest {

    static Map<Object, Long> addingMap;
    static Map<Object, Long> gettingMap;
    static Map<Object, Long> removingMap;
    static Map<Object, Long> containsMap;

    @BeforeAll
    static void setUp() {
        addingMap = puttingMap();
        gettingMap = gettingMap();
        removingMap = removingMap();
        containsMap = containsMap();
        printWelcome();
        printFunctions();
        printFaster();
    }

    @AfterAll
    static void cleaningUp() {
        clear();
    }

    private static void printWelcome() {
        System.out.printf(WHITE_BRIGHT + "::: MAP TESTS :::" + RESET + "%n");
    }

    private static void printFunctions() {
        addingMap.forEach((key, value) -> System.out.printf((MESSAGE_ADDING_COLOR) + "%n", "Putting", key, value));
        gettingMap.forEach((key, value) -> System.out.printf((MESSAGE_READING_COLOR) + "%n", "Reading", key, value));
        removingMap.forEach((key, value) -> System.out.printf((MESSAGE_REMOVING_COLOR) + "%n", "Removing", key, value));
        containsMap.forEach((key, value) -> System.out.printf((MESSAGE_CONTAINS_COLOR) + "%n", "Contains", key, value));
    }

    private static void printFaster() {
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Putting", getFaster(addingMap).getKey(), getFaster(addingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Reading", getFaster(gettingMap).getKey(), getFaster(gettingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Removing", getFaster(removingMap).getKey(), getFaster(removingMap).getValue());
        System.out.printf((MESSAGE_FASTER_COLOR) + "%n", "Contains", getFaster(containsMap).getKey(), getFaster(containsMap).getValue());
    }

    @Test
    @DisplayName("Reading - Validate that LinkedHashMap is Faster")
    void whenReadingInMap_shouldValidateThatLinkedHashMapIsFaster() {
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(gettingMap).getKey());
    }

    @Test
    @DisplayName("Removing - Validate that TreeMap is Slower than HashMap/LinkedHashMap")
    void whenRemovingInMap_shouldValidateThatTreeMapIsSlower() {
        assertEquals(TreeMap.class.getSimpleName(), getSlower(removingMap).getKey());
    }

    @Test
    @DisplayName("Contains - Validate that LinkedHashMap is Faster")
    void whenContainsMap_shouldValidateThatLinkedHashMapIsFaster() {
        assertEquals(LinkedHashMap.class.getSimpleName(), getFaster(containsMap).getKey());
    }

    private static void clear() {
        addingMap.clear();
        gettingMap.clear();
        containsMap.clear();
        removingMap.clear();
    }
}
