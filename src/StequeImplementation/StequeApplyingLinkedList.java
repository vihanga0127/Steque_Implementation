package StequeImplementation;

public class StequeApplyingLinkedList<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public StequeApplyingLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Push operation (adds an element to the front)
    public void push(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        size++;
    }

    // Pop operation (removes an element from the front)
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Steque is empty");
        }
        T data = head.data;
        head = head.next;
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return data;
    }

    // Enqueue operation (adds an element to the rear)
    public void enqueue(T item) {
        Node<T> newNode = new Node<>(item);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // Check if the steque is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Get the current size of the steque
    public int size() {
        return size;
    }

    // Main method to demonstrate the steque
    public static void main(String[] args) {
    	StequeApplyingLinkedList<Integer> steque = new StequeApplyingLinkedList<>();

        steque.push(16);
        steque.push(2);
        steque.enqueue(85);
        steque.enqueue(70);

        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
    }
}
