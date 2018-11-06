package org.autotest;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StackArTest {

    StackAr stack;

    @Before
    public void setUp() throws Exception {
        stack = new StackAr();
    }

    @After
    public void tearDown() throws Exception {
        stack = null;
    }

    @Test
    public void ConstructorNegativeCapacity() {
        try {
            stack = new StackAr(-1);
            fail("Expected IllegalArgumentException!");
        } catch (Exception e) {
            assertEquals(e.getClass(), IllegalArgumentException.class);
        }
    }

    @Test
    public void size() {
        assertEquals(stack.size(), 0);

        stack.push(1);
        assertEquals(stack.size(), 1);
    }

    @Test
    public void isEmpty() {
        assertTrue(stack.isEmpty());
        stack.push(1);
        assertFalse(stack.isEmpty());
    }

    @Test
    public void isFull() {
        assertFalse(stack.isFull());
    }

    @Test
    public void push() {
        stack.push(1);
        assertEquals(stack.pop(), 1);
    }

    @Test
    public void top() {
        stack.push(1);
        assertEquals(stack.top(), 1);
    }

    @Test
    public void emptyPop() {
        try {
            stack.pop();
            fail("Expected Pop Exception!");
        } catch(Exception e) {
            assertEquals(e.getClass(), IllegalStateException.class);
        }
    }

    @Test
    public void emptyTop() {
        try {
            stack.top();
            fail("Expected Top Exception!");
        } catch(Exception e) {
            assertEquals(e.getClass(), IllegalStateException.class);
        }
    }

    @Test
    public void fullPush() {
        stack = new StackAr(0);

        try {
            stack.push(1);
            fail("Expected Push Exception!");
        } catch(Exception e) {
            assertEquals(e.getClass(), IllegalStateException.class);
        }
    }

    @Test
    public void testHashCode() {
        StackAr a2 = new StackAr();
        assertEquals(a2.hashCode(), stack.hashCode());
    }

    @Test
    public void equals() {
        StackAr stack2 = new StackAr();

        //Iguales del objeto general
        assertTrue(stack2.equals(stack2));
        assertTrue(stack2.equals(stack));

        //No iguales del objeto general
        assertFalse(stack2.equals(null));
        assertFalse(stack2.equals("hola"));

        //Con elementos distintos
        stack.push(1);
        stack2.push(2);
        assertFalse(stack.equals(stack2));

        //Distintos readline
        stack  = new StackAr();
        stack2 = new StackAr();

        stack.push(1);
        stack2.push(1);
        stack2.pop();

        stack.size();

        assertFalse(stack.equals(stack2));
    }

    @Test
    public void testToString() {
        stack.push(1);
        stack.push(2);
        assertEquals("[1,2]", stack.toString());
    }
}