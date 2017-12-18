import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

public class StackTest {
    @Test
    public void testEquals() {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        assertTrue(stack1.equals(stack2));
        assertTrue(stack2.equals(stack1));

        stack1.push(1);

        assertFalse(stack1.equals(stack2));
        assertFalse(stack2.equals(stack1));

        stack1.push(2);
        stack2.push(1);
        stack2.push(2);

        assertTrue(stack1.equals(stack2));
        assertTrue(stack2.equals(stack1));

        stack2.push(3);

        assertFalse(stack1.equals(stack2));
        assertFalse(stack2.equals(stack1));
    }

    @Test
    public void testIterator() {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);

        Iterator<Integer> iterator = stack.iterator();
        assertTrue(iterator.hasNext());
        assertEquals(new Integer(2), iterator.next());

        stack.pop();
        stack.pop();
        stack.push(3);

        assertTrue(iterator.hasNext());
        assertEquals(new Integer(1), iterator.next());
        assertFalse(iterator.hasNext());
    }
}
