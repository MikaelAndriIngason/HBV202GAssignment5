package is.hi.hbv202g.ass5;

import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

public class IntStackTest {

    IntStack stack;

    // Part 4
    @Before
    public void createStack() {
        stack = new IntStack();
    }

    // Part 4
    @Test
    public void testNewStackIsNotFull() {
        assertFalse(stack.isFull());
    }

    // Part 5
    @Test
    public void testFullStackIsFull() {
        for (int i = 0; i < stack.getCapacity(); i++) {
            stack.push(i);
        }
        assertTrue(stack.isFull());
    }

    // Part 6
    @Test
    public void testFullStackWithOneLessIsFull() {
        for (int i = 0; i < stack.getCapacity() - 1; i++) {
            stack.push(i);
        }
        assertFalse(stack.isFull());
    }

    // Part 7
    @Test
    public void testPopReturnsPushedValue() {
        int x = 50;
        stack.push(x);
        assertEquals(x, stack.pop());
    }

    // Part 8
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsExceptionOnPop() {
        stack.pop();
    }

    // Part 8
    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void testArrayIndexOutOfBoundsExceptionOnPush() {
        for (int i = 0; i < stack.getCapacity() + 1; i++) {
            stack.push(i);
        }
    }

    // Part 9
    @Test
    public void testStackIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    // Part 9
    @Test
    public void testStackIsNotEmpty() {
        stack.push(1);
        assertFalse(stack.isEmpty());
    }
}
