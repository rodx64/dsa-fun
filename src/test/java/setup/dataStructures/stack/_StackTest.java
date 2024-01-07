package setup.dataStructures.stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class _StackTest {

    @Test
    void validateMyStack(){
        _Stack stack = new _Stack(4);
        assertEquals(4, stack.getTop().getValue());
        assertEquals(1, stack.getHeight());
        stack.printStack();
    }

    @Test
    void validateMyPush(){
        _Stack stack = new _Stack(3);
        assertEquals(3, stack.getTop().getValue());
        assertEquals(1, stack.getHeight());

        stack.push(2);
        assertEquals(2, stack.getTop().getValue());
        assertEquals(2, stack.getHeight());

        stack.push(1);
        assertEquals(1, stack.getTop().getValue());
        assertEquals(3, stack.getHeight());
    }

    @Test
    void validateMyPop() {
        _Stack stack = new _Stack(3);
        assertEquals(3, stack.getTop().getValue());
        assertEquals(1, stack.getHeight());

        stack.push(2);
        assertEquals(2, stack.getTop().getValue());
        assertEquals(2, stack.getHeight());

        stack.push(1);
        assertEquals(1, stack.getTop().getValue());
        assertEquals(3, stack.getHeight());

        stack.pop();
        assertEquals(2, stack.getTop().getValue());
        assertEquals(2, stack.getHeight());

        stack.pop();
        assertEquals(3, stack.getTop().getValue());
        assertEquals(1, stack.getHeight());

        stack.pop();
        assertNull(stack.getTop());
        assertEquals(0, stack.getHeight());
    }
}