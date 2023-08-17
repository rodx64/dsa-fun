package setup.dataStructures.queue;

import org.junit.jupiter.api.Test;
import setup.dataStructures.stack._Stack;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class _QueueTest {

    @Test
    void validateMyQueue(){
        _Queue queue = new _Queue(4);
        assertEquals(4, queue.getFirst().getValue());
        assertEquals(4, queue.getLast().getValue());
        assertEquals(1, queue.getLength());
        queue.printQueue();
    }

    @Test
    void validateMyEnqueue(){
        _Queue queue = new _Queue(1);
        assertEquals(1, queue.getFirst().getValue());
        assertEquals(1, queue.getLast().getValue());
        assertEquals(1, queue.getLength());

        queue.enqueue(2);
        assertEquals(1, queue.getFirst().getValue());
        assertEquals(2, queue.getLast().getValue());
        assertEquals(2, queue.getLength());

        queue.enqueue(3);
        assertEquals(1, queue.getFirst().getValue());
        assertEquals(3, queue.getLast().getValue());
        assertEquals(3, queue.getLength());
    }

    @Test
    void validateMyDequeue() {
        _Queue queue = new _Queue(1);
        assertEquals(1, queue.getFirst().getValue());
        assertEquals(1, queue.getLast().getValue());
        assertEquals(1, queue.getLength());

        queue.enqueue(2);
        assertEquals(1, queue.getFirst().getValue());
        assertEquals(2, queue.getLast().getValue());
        assertEquals(2, queue.getLength());

        queue.dequeue();
        assertEquals(2, queue.getFirst().getValue());
        assertEquals(2, queue.getLast().getValue());
        assertEquals(1, queue.getLength());

        queue.dequeue();
        assertNull(queue.getFirst());
        assertNull(queue.getLast());
        assertEquals(0, queue.getLength());
    }

}