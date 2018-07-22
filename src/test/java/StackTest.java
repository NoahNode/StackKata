import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class StackTest {
    @Test
    public void testIsEmpty(){
        Stack emptyStack = new Stack();
        Stack notEmptyStack = new Stack();

        notEmptyStack.push("Data");

        assertTrue(emptyStack.isEmpty());
        assertFalse(notEmptyStack.isEmpty());
    }

    @Test
    public void testSize(){
        Stack emptyStack = new Stack();
        Stack notEmptyStack = new Stack();

        assertEquals(0, emptyStack.size());
        assertEquals(0, notEmptyStack.size());

        notEmptyStack.push("String");
        assertEquals(1, notEmptyStack.size());

        notEmptyStack.push("String two");
        assertEquals(2, notEmptyStack.size());
    }

    @Test
    public void testPop(){
        Stack stack = new Stack(2);

        stack.push("String");
        stack.push("String 2");

        assertEquals("String 2", stack.pop());
        assertEquals("String", stack.pop());
        assertEquals(null, stack.pop());
    }


}
