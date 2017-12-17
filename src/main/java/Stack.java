import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<A> implements Iterable<A>{
    private Node<A> head;

    private static class Node<A> {
        private A content;
        private Node<A> next;

        public Node(A content, Node<A> next) {
            this.content = content;
            this.next = next;
        }
    }

    /**
     * Legt den Content oben auf dem Stapel ab.
     */
    public void push(A content) {
        head = new Node<A>(content, head);
    }

    /**
     * Entfernt das oberste Element vom Stapel und gibt es zurueck.
     */
    public A pop() {
        A topItem = top();
        head = head.next;
        return topItem;
    }

    /**
     * Gibt das oberste Element des Stapels zurueck.
     */
    public A top() {
        if (head == null) {
            throw new NoSuchElementException("stack empty");
        }
        return head.content;
    }

    public int size() {
        int i = 0;
        Node<A> current = head;
        while (current != null) {
            i++;
            current = current.next;
        }
        return i;
    }

    /**
     * Prueft ob der Stapel leer ist.
     */
    public boolean isEmpty() {
        return head == null;
    }

    public Iterator<A> iterator() {
        return new StackIterator<>(head);
    }

    public static class StackIterator<A> implements Iterator<A>{
        private Node<A> current;
        protected StackIterator(Node<A> first) {
            current = first;
        }

        public boolean hasNext() {
            return current != null;
        }

        public A next() {
            A item = current.content;
            current = current.next;
            return item;
        }
    }
}