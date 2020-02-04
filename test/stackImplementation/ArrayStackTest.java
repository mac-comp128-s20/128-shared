import stackImplementation.arrayStack.ArrayStack;
import stackImplementation.exceptions.EmptyCollectionException;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by shoop on 3/15/17.
 */
public class ArrayStackTest {

    @Test
    public void testPushPop() {
        ArrayStack<Integer> testStack = new ArrayStack<Integer>(5);

        testStack.push(10);
        assertEquals(1, testStack.size());
        testStack.push(12);
        int num = testStack.pop();
        assertEquals(12, num);
        assertFalse(testStack.isEmpty());
        num = testStack.pop();
        assertEquals(10, num);
        assertTrue(testStack.isEmpty());

    }

    @Test
    public void testExpand(){
        ArrayStack<Integer> testStack = new ArrayStack<Integer>(5);
        for(int i=0; i < 10; i++) {
            testStack.push(i);
        }
        for(int i=9; i >= 0; i--){
            assertEquals((Integer)i, testStack.pop());
        }
    }

    // TODO: add more test methods here

    // Study this test carefully
    @Test
    public void testEmpty() {
        ArrayStack<Integer> testStack = new ArrayStack<Integer>(5);

        testStack.push(10);
        assertEquals(1, testStack.size());
        int num = testStack.pop();

        try {
            num = testStack.pop();
        } catch (EmptyCollectionException e) {
            System.out.println(e.getMessage());
            assertEquals(e.getMessage(), "The stack is empty.");
        }

    }

    @Test
    public void testToString(){
        ArrayStack<Character> testStack = new ArrayStack<Character>(10);

        testStack.push('!');
        testStack.push('t');
        testStack.push('l');
        testStack.push('u');
        testStack.push('s');
        testStack.push('e');
        testStack.push('R');

        assertEquals("[R, e, s, u, l, t, !]", testStack.toString());
        assertFalse(testStack.isEmpty());
        assertEquals("[R, e, s, u, l, t, !]", testStack.toString()); // calling toString should not modify the contents of the stack
    }

    // TODO: add test methods for peek() here


}
