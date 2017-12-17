import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Iterator;

public class StackTest {
    @Test public void testIterator() {
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
