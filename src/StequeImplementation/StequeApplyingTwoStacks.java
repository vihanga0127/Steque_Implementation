package StequeImplementation;

import java.util.Stack;

public class StequeApplyingTwoStacks<T> {
    private Stack<T> stack1;
    private Stack<T> stack2;

    // Constructor to initialize the two stacks
    public StequeApplyingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    // Method to push an element to the front of the steque
    public void push(T item) {
        stack1.push(item);
    }

    // Method to enqueue an element to the end of the steque
    public void enqueue(T item) {
        stack2.push(item);
    }

    // Method to pop an element from the front of the steque
    public T pop() {
        if (stack1.isEmpty()) {
            while (!stack2.isEmpty()) {
                stack1.push(stack2.pop());
            }
        }
        if (!stack1.isEmpty()) {
            return stack1.pop();
        } else {
            throw new RuntimeException("Steque is empty");
        }
    }

    // Method to check if the steque is empty
    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    // Method to get the size of the steque
    public int size() {
        return stack1.size() + stack2.size();
    }

    public static void main(String[] args) {
        StequeApplyingTwoStacks<Integer> steque = new StequeApplyingTwoStacks<>();
        
        // Testing push operation
        steque.push(18);
        steque.push(43);
        steque.push(8);
        
        System.out.println("Popped element: " + steque.pop());
        System.out.println("Is the steque empty? " + steque.isEmpty());
        System.out.println("Size of the steque: " + steque.size());
        }
    }


