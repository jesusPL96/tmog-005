package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Slf4j
class MinStackTest {

    @Test
    void testMinStack() {

        log.info("Don't forget to write the tests to make sure it works. Enjoy!");
    }

    @Test
    void push() {

        MinStack minStack = new MinStack();
        minStack.push(1);

        assertEquals(1, minStack.top());

    }

    @Test
    void popToEmpty() {

        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.pop();

        assertThrows(IllegalStateException.class, minStack::top);

    }

    @Test
    void popToNumber() {

        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(4);
        minStack.pop();

        assertEquals(1, minStack.top());

    }

    @Test
    void popWhenEmptyStack() {

        MinStack minStack = new MinStack();

        assertThrows(NoSuchElementException.class, minStack::pop);
    }

    @Test
    void top() {

        MinStack minStack = new MinStack();
        minStack.push(1);

        var result = minStack.top();

        assertEquals(1, result);

    }

    @Test
    void getMin() {

        MinStack minStack = new MinStack();
        minStack.push(2);
        minStack.push(4);
        minStack.push(8);

        var result = minStack.getMin();

        assertEquals(2, result);

    }

}