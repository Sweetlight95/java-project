package chapter16;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {
    private Stack stack;

    @BeforeEach
    public void stackCanCreateTest(){
       stack = new Stack(5);
    }
    @Test
    public void stackCanCreatedTest() {
        assertNotNull(stack);
    }
    @Test
    public void addXStackSizeIs1Test(){
        stack.push(3);
        assertEquals(1, stack.size());
    }
    @Test
    public void addXYStackSizeIsTest(){
        stack.push(3);
        stack.push(6);
        assertEquals(2, stack.size());
    }
    @Test
    public void addXRemoveXStackShouldBeEmptyTest(){
        stack.push(3);
        stack.pop();
        assertEquals(0, stack.size());
        assertTrue(stack.isEmpty());
    }
    @Test
    public void RemovingFromAnEmptyStackThrowsUnderFlowTest(){
        assertTrue(stack.isEmpty());
        assertThrows(Stack.UnderFlowException.class, ()->stack.pop());
    }
    @Test
    public void addXPeekShowsXTest() {
        stack.push(4);
        stack.push(7);
        stack.push(2);
        stack.push(9);
        assertEquals(9, stack.peek());
    }
    @Test
    void addXYZPopZY_XShouldBeAtPeekTest() {
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        assertEquals(1, stack.size());
        assertEquals(4, stack.peek());
    }
    @Test
    void addXYZABC_StackThrowsOverFlowTest() {
        stack.push(43);
        stack.push(21);
        stack.push(12);
        stack.push(12);
        stack.push(43);
        assertThrows(Stack.OverflowException.class, ()->stack.push(31));
    }
    @Test
    void peekEmptyStack_throwsUnderFlowTest() {
        assertThrows(Stack.UnderFlowException.class, () ->stack.peek());
    }
}