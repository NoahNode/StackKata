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


}
