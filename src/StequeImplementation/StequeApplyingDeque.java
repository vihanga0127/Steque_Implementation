package StequeImplementation;

import java.util.ArrayDeque;
import java.util.Deque;

public class StequeApplyingDeque<T> {
    private Deque<T> deque;

    public StequeApplyingDeque() {
        deque = new ArrayDeque<>();
    }

    // Push operation (adds an element to the front)
    public void push(T item) {
        deque.addFirst(item);
    }

    // Pop operation (removes an element from the front)
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Steque is empty");
        }
        return deque.removeFirst();
    }

    // Enqueue operation (adds an element to the rear)
    public void enqueue(T item) {
        deque.addLast(item);
    }

    // Check if the steque is empty
    public boolean isEmpty() {
        return deque.isEmpty();
    }

    // Get the current size of the steque
    public int size() {
        return deque.size();
    }

    // Main method to demonstrate the steque
    public static void main(String[] args) {
    	StequeApplyingDeque<Integer> steque = new StequeApplyingDeque<>();

        steque.push(37);
        steque.push(90);
        steque.enqueue(89);
        steque.enqueue(40);

        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
